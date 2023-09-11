package com.luv2code.restcruddemo.rest;

public class StudentErrorResponse {
	private int status;
	private String message;
	private long timeStamp;
	public StudentErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentErrorResponse(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
	
}
