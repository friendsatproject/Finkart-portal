package com.java.finkart.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	
	@JsonProperty(value = "customer_id")
	Integer customerId;
	
	@JsonProperty(value = "customer_name")
	String customerName;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
