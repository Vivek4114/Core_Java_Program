package com.nit.AmazonBasedProject;

import java.util.LinkedList;

public class Customer {
	
	Cart c;
	int customerId;
	String CustomerName;
	
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		CustomerName = customerName;
	}

	
	public int getCustomerId() {
		return customerId;
	}
	 
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	 
	public String getCustomerName() {
		return CustomerName;
	}
	 
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", CustomerName=" + CustomerName + "]";
	}
	 
	
	
	
	
}

