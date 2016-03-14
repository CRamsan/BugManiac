package com.cesarandres.bugmaniac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
import com.cesarandres.bugmaniac.model.ReportBucket;
import com.cesarandres.bugmaniac.model.ReportBucketList;
import com.google.appengine.api.datastore.Cursor;

public class BucketsServlet extends HttpServlet {

	private static final long serialVersionUID = 1845720066537659202L;
	private static final Logger logger = Logger.getLogger(BucketsServlet.class
			.toString());
	private static final int DEFAULT_PAGE_SIZE = 10;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		String requestPath = req.getPathInfo();
		logger.info(requestPath);
		
		int pageSize = DEFAULT_PAGE_SIZE;
		PrintWriter out = resp.getWriter();

		try {
			String count = req.getParameter("count");
			if (count != null) {
				pageSize = Integer.parseInt(count);
			}
		} catch (NumberFormatException e) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			logger.warning(e.getMessage());
			Helpers.respondWithError(out, "Bad request. Property \"count\" has invalid value");
			return;
		}

		String cursorString = req.getParameter("cursor");
		Cursor cursor = null;
		
		if (cursorString != null && !("null".equalsIgnoreCase(cursorString))){
			try{
				cursor = Cursor.fromWebSafeString(cursorString);
			}catch(IllegalArgumentException e){
				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				logger.warning(e.getMessage());
				Helpers.respondWithError(out, "Bad request. Cursor is not valid");
				return;
			}
		}

		String bucketSignature = Helpers.getElementId(requestPath);
		
		if(bucketSignature == null){
			ReportBucketList response = (ReportBucketList) EntityManager.getAllElements(pageSize, cursor, ReportBucket.class);
			resp.setStatus(HttpServletResponse.SC_OK);
			Helpers.respondWithData(out, response);
		}else{
			ReportBucket response = EntityManager.getReportBucket(bucketSignature);
			if(response != null){
				resp.setStatus(HttpServletResponse.SC_OK);
				Helpers.respondWithData(out, response);
			}else{
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				Helpers.respondWithMessage(out, "No Bug with that ID");
			}
		}
	}
}
