package com.java.finkart.controller;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.finkart.exception.FlinkcartPortalException;
import com.java.finkart.request.LoginRequest;
import com.java.finkart.response.LoginResponse;
import com.java.finkart.response.ServiceResponse;
import com.java.finkart.service.CustomerProfileService;

@RestController
@RequestMapping("customerProfile")
public class CustomerProfileController {
	Log log;
	@Autowired
	private CustomerProfileService customerProfileService;
	
	@PostMapping("/getCustomerProfile")
	public ServiceResponse getCustomerProfile(@RequestBody LoginRequest loginRequest){
		ServiceResponse response = null;
		try {
			response = customerProfileService.getCustomerDetails(loginRequest);
		}catch(FlinkcartPortalException flinkcartPortalException) {
			log.debug(flinkcartPortalException);
		}
		return response;
		
	}

}
