package com.java.finkart.request;

import lombok.Data;

@Data
public class LoginRequest extends ServiceReqest{
	
	
	private String userId;
	private String password;
	private String role;
	

}
