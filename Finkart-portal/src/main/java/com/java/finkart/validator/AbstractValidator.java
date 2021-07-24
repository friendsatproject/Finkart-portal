package com.java.finkart.validator;

import java.util.List;

import com.java.finkart.exception.FlinkcartPortalException;
import com.java.finkart.request.ServiceRequest;

import lombok.Data;

@Data
public abstract class AbstractValidator implements Validator{

	/**
	 * 
	 */
	public List<String> errorMassage;
	/**
	 * 
	 */
	public String errorCode;
	

	/**
	 *
	 */
	public Validator validate(ServiceRequest servicRequest) throws FlinkcartPortalException{
		Validator validator = null;
		try {
			validator = process(servicRequest);
		}catch(Exception exception) {
			
		}
		return validator;
	}
	/**
	 * @return
	 */
	public List<String> getErrorMassage() {
		return errorMassage;
	}


	/**
	 * @param errorMassage
	 */
	public void setErrorMassage(List<String> errorMassage) {
		this.errorMassage = errorMassage;
	}


	/**
	 * @return
	 */
	public String getErrorCode() {
		return errorCode;
	}


	/**
	 * @param errorCode
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


}
