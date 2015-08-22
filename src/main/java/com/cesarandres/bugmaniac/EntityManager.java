package com.cesarandres.bugmaniac;

import java.util.ArrayList;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
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

	public static ACRAReportList getAllAcraReports(int pageSize,
			String cursorString) {
		Query<ACRAReport> query = ObjectifyService.ofy().load()
				.type(ACRAReport.class).limit(pageSize);

		if (cursorString != null && !("null".equalsIgnoreCase(cursorString)))
			query = query.startAt(Cursor.fromWebSafeString(cursorString));

		boolean continueIter = false;
		QueryResultIterator<ACRAReport> iterator = query.iterator();
		ArrayList<ACRAReport> reportList = new ArrayList<ACRAReport>();
		while (iterator.hasNext()) {
			ACRAReport report = iterator.next();
			reportList.add(report);
			continueIter = true;
		}

		String cursorNextString = null;
		if (continueIter) {
			Cursor cursor = iterator.getCursor();
			cursorNextString = cursor.toWebSafeString();
		}

		if (cursorNextString != null || cursorString != null) {
			Queue queue = QueueFactory.getDefaultQueue();
			TaskOptions options = TaskOptions.Builder.withUrl("/");
			if (cursorNextString != null) {
				options.param("cursor", cursorNextString);
			}
			queue.add(options);
		}

		ACRAReportList response = new ACRAReportList();
		response.setData(reportList);
		response.setCursorNext(cursorNextString);
		return response;
	}

	public static ACRAReport getAcraReport(String bugID) {
		Key<ACRAReport> bugKey = Key.create(ACRAReport.class, bugID);
		ACRAReport report = ObjectifyService.ofy().load().key(bugKey).now();
		return report;
	}

	public static void saveAcraReport(ACRAReport report) {
		ObjectifyService.ofy().save().entity(report).now();
	}
	
	public static void deleteAcraReport(ACRAReport report) {
		ObjectifyService.ofy().delete().entity(report).now();
	}
	
	public static void deleteAcraReport(String reportId) {
		ACRAReport report = getAcraReport(reportId);
		ObjectifyService.ofy().delete().entity(report).now();
	}
}
