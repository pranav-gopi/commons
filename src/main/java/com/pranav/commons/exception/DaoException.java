package com.pranav.commons.exception;

public class DaoException extends ServiceException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8829994558750752066L;

	public DaoException() {
		super("Dao Exception");
	}

	public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super("Service Exception", cause);
	}

	
}
