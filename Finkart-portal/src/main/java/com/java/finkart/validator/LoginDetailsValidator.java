package com.java.finkart.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.java.finkart.exception.FlinkcartPortalException;
import com.java.finkart.request.LoginRequest;
import com.java.finkart.request.ServiceRequest;
import com.java.finkart.util.Constant;

@Component("loginDetailsValidator")
public class LoginDetailsValidator extends AbstractValidator{

	/**
	 *
	 */
	@Override
	public Validator process(ServiceRequest servicRequest) throws FlinkcartPortalException {
		String flowName = "LoginDetailsValidator.process()";
		Validator validator = new LoginDetailsValidator();
		LoginRequest loginRequest = (LoginRequest) servicRequest;
		List<String> list = new ArrayList<String>();
		try{
			if(loginRequest == null ) {
				((AbstractValidator) validator).setErrorCode(Constant.Error);
				list.add("Login Request is Null");
				((AbstractValidator) validator).setErrorMassage(list);
			}
			if(loginRequest.getUserId() == null) {
				((AbstractValidator) validator).setErrorCode(Constant.Error);
				list.add("User Id is Null");
				((AbstractValidator) validator).setErrorMassage(list);
			}
			if(loginRequest.getPassword() == null) {
				((AbstractValidator) validator).setErrorCode(Constant.Error);
				list.add("Password is Null");
				((AbstractValidator) validator).setErrorMassage(list);
			}
			if(loginRequest.getRole() == null) {
				((AbstractValidator) validator).setErrorCode(Constant.Error);
				list.add("User Role is Null");
				((AbstractValidator) validator).setErrorMassage(list);
			}
		}catch(Exception exception) {
			throw new FlinkcartPortalException(flowName,Constant.Error,exception);
		}
		return validator;		
	}
}
