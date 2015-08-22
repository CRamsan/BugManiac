package com.cesarandres.bugmaniac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.repackaged.org.codehaus.jackson.JsonGenerationException;

public class BugsServlet extends HttpServlet {

	private static final long serialVersionUID = 9041520078583855828L;
	private static final Logger logger = Logger.getLogger(BugsServlet.class
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

		
		String bugID = Helpers.getBugId(requestPath);
		
		if(bugID == null){
			ACRAReportList response = EntityManager.getAllAcraReports(pageSize, cursor);
			resp.setStatus(HttpServletResponse.SC_OK);
			Helpers.respondWithData(out, response);
		}else{
			ACRAReport response = EntityManager.getAcraReport(bugID);
			if(response != null){
				resp.setStatus(HttpServletResponse.SC_OK);
				Helpers.respondWithData(out, response);
			}else{
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				Helpers.respondWithMessage(out, "No Bug with that ID");
			}
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		String requestPath = req.getPathInfo();
		logger.info(requestPath);
		
		String bugID = Helpers.getBugId(requestPath);

		PrintWriter out = resp.getWriter();
		if(bugID != null){
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			Helpers.respondWithError(out, "Bad request, do not provide BugID in the URL");
			return;
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				req.getInputStream()));

		StringBuilder sb = new StringBuilder();
		try {
			String line;
			do {
				line = reader.readLine();
				sb.append(line).append("\n");
			} while (line != null);
		} catch (IOException e) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			logger.warning(e.getMessage());
			Helpers.respondWithError(out, "Error while reading data");
			return;
		}
		
		ACRAReport acraReport = null;
		
		try {
			acraReport = Helpers.mapper.readValue(sb.toString(),
					ACRAReport.class);
		} catch (JsonGenerationException e) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			logger.warning(e.getMessage());
			logger.warning(sb.toString());
			Helpers.respondWithError(out, "Data is not in JSON format");
			return;
		} catch (JsonMappingException e) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			logger.warning(e.getMessage());
			logger.warning(sb.toString());
			Helpers.respondWithError(out, "JSONMapping error");
			return;
		} catch (IOException e) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			logger.warning(e.getMessage());
			logger.warning(sb.toString());
			Helpers.respondWithError(out, "IO error while mapping");
			return;
		}

		EntityManager.saveAcraReport(acraReport);
		resp.setStatus(HttpServletResponse.SC_OK);
		Helpers.respondWithMessage(out, "Report uploaded");
	}

	@Override
	public void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		String requestPath = req.getPathInfo();
		logger.info(requestPath);

		PrintWriter out = resp.getWriter();				
		String bugID = Helpers.getBugId(requestPath);
		if(bugID == null){
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			Helpers.respondWithError(out, "No bug report found");
		}else{	
			EntityManager.deleteAcraReport(bugID);
			resp.setStatus(HttpServletResponse.SC_OK);
			Helpers.respondWithMessage(out, "Report " + bugID + " was removed");
		}
	}
}
