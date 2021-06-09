package com.arijit.microservices.movieinfoservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.arijit.microservices.movieinfoservice.models.ErrorPayload;

@ControllerAdvice
public class MovieExceptionHandler {
	
	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<ErrorPayload> movieNotFoundException(MovieNotFoundException e, WebRequest r) {
		ErrorPayload errorPayload = new ErrorPayload(e.getMessage(), HttpStatus.NOT_FOUND.name());
		
		return new ResponseEntity<ErrorPayload>(errorPayload, HttpStatus.NOT_FOUND);
	}
	
}
