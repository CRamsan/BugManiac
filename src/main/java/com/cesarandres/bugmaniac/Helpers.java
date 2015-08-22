package com.cesarandres.bugmaniac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import com.cesarandres.bugmaniac.model.ACRAReport;
import com.cesarandres.bugmaniac.model.ACRAReportList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Helpers {
	
	public static final ObjectMapper mapper = new ObjectMapper();
	
	public static String generateError(String message){
		return "{\"error\":\"" + message + "\"," + 
				"\"timestamp\":" + (System.currentTimeMillis() / 1000L) + "," +
				"\"errorId\":\"" + UUID.randomUUID() + "\"}";
	}
	
	public static String generateSuccess(String message){
		return "{\"message\":\"" + message + "\"}";
	}
	
	public static void respondWithData(PrintWriter out, ACRAReportList response){
		try {
			out.write(mapper.writeValueAsString(response));
		} catch (IOException e) {
			respondWithError(out, "Response was successful but there was a problem serializing it");
			return;
		}
		out.close();
	}
	
	public static void respondWithData(PrintWriter out, ACRAReport response){
		try {
			out.write(mapper.writeValueAsString(response));
		} catch (IOException e) {
			respondWithError(out, "Response was successful but there was a problem serializing it");
			return;
		}
		out.close();
	}
	
	public static void respondWithMessage(PrintWriter out, String errorMessage){
		out.write(generateSuccess(errorMessage));
		out.close();
	}
	
	public static void respondWithError(PrintWriter out, String errorMessage){
		out.write(generateError(errorMessage));
		out.close();
	}
	
	public static final String getBugId(String pathInfo){
		if(pathInfo != null){
			if(pathInfo.indexOf('/') == 0){
				if(pathInfo.length() != 1){
					return pathInfo.substring(1, pathInfo.length());
				}
			}
		}
		return null;
	}
}
