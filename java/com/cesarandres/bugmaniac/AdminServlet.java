package com.cesarandres.bugmaniac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
import com.google.appengine.api.datastore.Cursor;

public class AdminServlet extends HttpServlet {

	private static final long serialVersionUID = 4459895668425800990L;
	private static final Logger logger = Logger.getLogger(AdminServlet.class
			.toString());

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		String requestPath = req.getPathInfo();
		logger.info(requestPath);
		
		PrintWriter out = resp.getWriter();

		String command = req.getParameter("command");
		
		if(command != null){
			switch (command) {
			case "generatebuckets":
				//generateBucketsV1();
			case "destroybuckets":
				//destroyBucketsV1();
				break;
			default:
				break;
			}
		}
		
		resp.setStatus(HttpServletResponse.SC_OK);
		Helpers.respondWithMessage(out, command);
	}
	
	public static void generateBucketsV1(){
		ACRAReportList list = (ACRAReportList)(EntityManager.getAllElements(100, null, ACRAReport.class));
		if(list.getCursorNext() == null){
			list.setCursorNext("");
		}
		String cursor = null;
		while(!list.getCursorNext().equals(cursor)){
			for(ACRAReport report : list.getData()){
				EntityManager.deleteAcraReport(report);
				EntityManager.saveAcraReport(report);
			}
			cursor = list.getCursorNext();
			list = (ACRAReportList)(EntityManager.getAllElements(100, Cursor.fromWebSafeString(cursor), ACRAReport.class));
			if(list.getCursorNext() == null){
				break;
			}
		}
	}

	public static void destroyBucketsV1(){
		ACRAReportList list = (ACRAReportList)(EntityManager.getAllElements(100, null, ACRAReport.class));
		if(list.getCursorNext() == null){
			list.setCursorNext("");
		}
		String cursor = null;
		while(!list.getCursorNext().equals(cursor)){
			for(ACRAReport report : list.getData()){
				EntityManager.deleteAcraReport(report);
				EntityManager.saveAcraReport(report);
			}
			cursor = list.getCursorNext();
			list = (ACRAReportList)(EntityManager.getAllElements(100, Cursor.fromWebSafeString(cursor), ACRAReport.class));
			if(list.getCursorNext() == null){
				break;
			}
		}
	}}
