package com.cesarandres.bugmaniac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DummyServlet extends HttpServlet {

	private static final long serialVersionUID = 1845720066537659202L;
	private static final Logger logger = Logger.getLogger(BucketsServlet.class
			.toString());
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
				
		resp.setStatus(HttpServletResponse.SC_OK);
		PrintWriter out = resp.getWriter();
		out.write(Helpers.generateSuccess("Dummy response"));
		out.close();
	}
}
