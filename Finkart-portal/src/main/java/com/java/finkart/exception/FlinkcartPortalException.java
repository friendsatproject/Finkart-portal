package com.java.finkart.exception;

import lombok.Data;

@Data
public class FlinkcartPortalException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String massage;
	private final String code;
	private final Object exception;
	
	
	public FlinkcartPortalException(String massage, String code, Object exception){
		super(massage,(Throwable) exception,true,true);
		this.massage = massage;
		this.code = code;
		this.exception = exception;
	}
}
