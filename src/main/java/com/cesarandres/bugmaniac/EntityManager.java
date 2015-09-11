package com.cesarandres.bugmaniac;

import java.util.ArrayList;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
import com.cesarandres.bugmaniac.model.ReportBucket;
import com.cesarandres.bugmaniac.model.ReportBucketList;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

public class EntityManager {
	public static final int DEFAULT_PAGE_SIZE = 10;

	public static Object getAllElements(int pageSize, Cursor cursor, Class itemClass) {
		Query query = ObjectifyService.ofy().load().type(itemClass).limit(pageSize);

		if (cursor != null)
			query = query.startAt(cursor);
		
		boolean continueIter = false;
		QueryResultIterator iterator = query.iterator();
		ArrayList objecttList = new ArrayList();
		while (iterator.hasNext()) {
			Object item = iterator.next();
			objecttList.add(item);
			continueIter = true;
		}
		
		String cursorNextString = null;
		if (continueIter) {
			Cursor nextCursor = iterator.getCursor();
			cursorNextString = nextCursor.toWebSafeString();
		}

		if (cursorNextString != null) {
			Queue queue = QueueFactory.getDefaultQueue();
			TaskOptions options = TaskOptions.Builder.withUrl("/");
			if (cursorNextString != null) {
				options.param("cursor", cursorNextString);
			}
			queue.add(options);
		}

		if (itemClass == ACRAReport.class) {
			ACRAReportList response = new ACRAReportList();
			response.setData(objecttList);
			response.setCursorNext(cursorNextString);
			return response;
		} else if (itemClass == ReportBucket.class) {
			ReportBucketList response = new ReportBucketList();
			response.setData(objecttList);
			response.setCursorNext(cursorNextString);
			return response;
		} else {
			return null;
		}
	}

	public static int countBucketSize(String signature) {
		return ObjectifyService.ofy().load().type(ACRAReport.class).filter("SIGNATURE", signature).count();
	}

	public static ACRAReport getAcraReport(String bugID) {
		Key<ACRAReport> bugKey = Key.create(ACRAReport.class, bugID);
		ACRAReport report = ObjectifyService.ofy().load().key(bugKey).now();
		return report;
	}

	public static void saveAcraReport(ACRAReport report) {
		report.setSignature(report.generateSignature());
		ReportBucket bucket = getReportBucket(report.getSignature());
		if (bucket == null) {
			bucket = new ReportBucket();
			bucket.setCRASHSIGNATURE(report.getSignature());
			bucket.setCRASHHEADER(report.getCrashHeader());
			bucket.setCRASHCOUNT(1);
			saveReportBucket(bucket);
		} else {
			bucket.setCRASHCOUNT(countBucketSize(report.getSignature()) + 1);
			saveReportBucket(bucket);
		}
		ObjectifyService.ofy().save().entity(report).now();
	}

	public static void deleteAcraReport(ACRAReport report) {
		ObjectifyService.ofy().delete().entity(report).now();
	}

	public static void deleteAcraReport(String reportId) {
		ACRAReport report = getAcraReport(reportId);
		ObjectifyService.ofy().delete().entity(report).now();
	}

	public static void saveReportBucket(ReportBucket bucket) {
		ObjectifyService.ofy().save().entity(bucket).now();
	}

	public static ReportBucket getReportBucket(String signature) {
		Key<ReportBucket> signatureKey = Key.create(ReportBucket.class, signature);
		ReportBucket bucket = ObjectifyService.ofy().load().key(signatureKey).now();
		return bucket;
	}
}
