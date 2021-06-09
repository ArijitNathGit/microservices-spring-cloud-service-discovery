package com.arijit.microservices.movieinfoservice.exceptions;

public class MovieNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieNotFoundException() {}
	
	public MovieNotFoundException(String message) {
		super(message);
	}
	
	public MovieNotFoundException(String message, Throwable e) {
		super(message, e);
	}
}
