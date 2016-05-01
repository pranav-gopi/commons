package com.pranav.commons.exception;

public class InvalidParamException extends ServiceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8829994558750752066L;

	public InvalidParamException() {
		super("Dependency Exception");
	}

	public InvalidParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidParamException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidParamException(String message) {
		super(message);
	}

	public InvalidParamException(Throwable cause) {
		super("Service Exception", cause);
	}

	
}
