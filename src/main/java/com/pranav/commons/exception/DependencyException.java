package com.pranav.commons.exception;

public class DependencyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8829994558750752066L;

	public DependencyException() {
		super("Service Exception");
	}

	public DependencyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DependencyException(String message, Throwable cause) {
		super(message, cause);
	}

	public DependencyException(String message) {
		super(message);
	}

	public DependencyException(Throwable cause) {
		super("Service Exception", cause);
	}

	
}
