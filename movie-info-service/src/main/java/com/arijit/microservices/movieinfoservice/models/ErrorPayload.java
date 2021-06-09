package com.arijit.microservices.movieinfoservice.models;

public class ErrorPayload {
	private String errorMesage;
	private String errorCode;
	
	public ErrorPayload() {}

	public ErrorPayload(String errorMesage, String errorCode) {
		super();
		this.errorMesage = errorMesage;
		this.errorCode = errorCode;
	}
	
	public String getErrorMesage() { return errorMesage; }

	public void setErrorMesage(String errorMesage) { this.errorMesage = errorMesage; }

	public String getErrorCode() { return errorCode; }

	public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
}
