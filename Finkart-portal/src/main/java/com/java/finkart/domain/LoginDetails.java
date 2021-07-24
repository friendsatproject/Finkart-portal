package com.java.finkart.domain;

import lombok.Data;

@Data
public class LoginDetails {
	private String userId;
	private String password;
	private String role;
}
