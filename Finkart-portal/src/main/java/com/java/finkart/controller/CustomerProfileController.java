package com.java.finkart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.finkart.domain.Customer;

@RestController
@RequestMapping("customerProfile")
public class CustomerProfileController {
	
	@GetMapping("/getCustomerProfile")
	public Customer getCustomerProfile(){
		
		Customer customer = new Customer();
		customer.setCustomerId(10);
		customer.setCustomerName("abc");
		
		return customer;
		
	}

}
