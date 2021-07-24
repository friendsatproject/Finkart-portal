package com.java.finkart.request;

import lombok.Data;

@Data
public abstract class ServiceRequest implements Request{
	
	private String requsetTime;
	private String resopnseTime;
	private String requestName;

}
