package com.java.finkart.validator;

import com.java.finkart.exception.FlinkcartPortalException;
import com.java.finkart.request.ServiceRequest;

public interface Validator {
	
	
	public Validator process(ServiceRequest servicRequest) throws FlinkcartPortalException;

	public Validator validate(ServiceRequest servicRequest) throws FlinkcartPortalException;

}
