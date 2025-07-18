package com.nt.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ActorAPIRestControllerAdvice {
	
	@ExceptionHandler(IllegalArgumentException.class)
	 public ResponseEntity<String> handleiAE(IllegalArgumentException iae){
		return new ResponseEntity<String>("problem::"+iae.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllExceptions(Exception e){
		return new ResponseEntity<String>("problem::"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

