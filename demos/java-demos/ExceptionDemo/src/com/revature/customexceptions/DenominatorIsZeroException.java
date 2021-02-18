package com.revature.customexceptions;

public class DenominatorIsZeroException extends Exception {

	public DenominatorIsZeroException() {
		super();
	}

	public DenominatorIsZeroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DenominatorIsZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public DenominatorIsZeroException(String message) {
		super(message);
	}

	public DenominatorIsZeroException(Throwable cause) {
		super(cause);
	}

}
