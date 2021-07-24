package com.java.finkart.request;

import com.java.finkart.domain.LoginDetails;

import lombok.Data;

@Data
public class LoginRequest extends ServiceRequest{
	
	
	private String userId;
	private String password;
	private String role;
	LoginDetails loginDetails;

}
