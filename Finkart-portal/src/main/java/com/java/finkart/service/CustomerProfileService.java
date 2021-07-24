package com.java.finkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.finkart.exception.FlinkcartPortalException;
import com.java.finkart.request.LoginRequest;
import com.java.finkart.response.LoginResponse;
import com.java.finkart.service.impl.CustomerProfileServicImpl;
import com.java.finkart.util.Constant;
import com.java.finkart.validator.AbstractValidator;
import com.java.finkart.validator.LoginDetailsValidator;
import com.java.finkart.validator.Validator;

@Component
public class CustomerProfileService {
	
	@Autowired
	@Qualifier("loginDetailsValidator")
	Validator loginDetailsValidator;
	
	@Autowired
	CustomerProfileServicImpl customerProfileServicImpl;
	
	/**
	 * @param loginRequest
	 * @return
	 * @throws FlinkcartPortalException
	 */
	public LoginResponse getCustomerDetails(LoginRequest loginRequest)throws FlinkcartPortalException {
		
		LoginResponse loginResponse = null;
		Validator validator = null;
		try {
			validator = loginDetailsValidator.validate(loginRequest);
			if(null != validator && ((LoginDetailsValidator) validator).getErrorCode().equals(Constant.Error)) {
				loginResponse = new LoginResponse();
				loginResponse.setResponseCode(Constant.Error);
				loginResponse.setResponseMessage("");
				loginResponse.setResponseDiscription(((AbstractValidator) validator).getErrorMassage());
			}
			
			loginResponse = customerProfileServicImpl.getLoginDetailsByUserNameAndRole(loginRequest);
		}catch(FlinkcartPortalException flinkcartPortalException) {
			throw flinkcartPortalException;
		}catch(Exception exception) {
			throw new FlinkcartPortalException(null, Constant.Error, exception);
		}
		return loginResponse;
		
	}

}
