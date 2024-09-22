package com.bricktobrick.B2BConnect.common;

public class CommonException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CommonException(String mesage) {
		super(mesage);
	}

	public static CommonException createException(CommonExceptionMessage message, Object... parameters) {
		String format = message.getMessgae();
		return new CommonException(String.format(format, parameters));
	}

}
