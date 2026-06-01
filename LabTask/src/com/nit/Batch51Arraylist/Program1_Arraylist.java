package com.nit.Batch51Arraylist;

import java.util.ArrayList;

record Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
		String phone) {

	public Customer {
		if (custId <= 0) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if (customerName == null || customerName.isBlank() || customerName.isEmpty()) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if (pickupLocation == null || pickupLocation.isBlank() || pickupLocation.isEmpty()) {
			throw new IllegalArgumentException("Invalid pickupLocation");
		}
		if (dropLocation == null || dropLocation.isBlank() || dropLocation.isEmpty()) {
			throw new IllegalArgumentException("Invalid dropLocation");
		}

		if (distance < 0) {
			throw new IllegalArgumentException("Invalid distance");
		}

		if (phone == null || phone.isBlank() || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
	}
}

class CustomerService {
	private ArrayList<Customer> custList;

	public CustomerService() {
		custList = new ArrayList<Customer>();
	}

	void addCustomer(Customer customer) {
		custList.add(customer);
	}

	private boolean isFirstCustomer(Customer customer) {
		for (Customer c : custList) {
			if (c.phone().equals(customer.phone())) {
				return false;
			}
		}
		return true;
	}

	public double calculateBill(Customer customer) {
		double rideRate = 0;
		boolean firstRide = isFirstCustomer(customer);

		if (firstRide) {
			rideRate = 0;
		} else if (customer.distance() <= 4) {
			rideRate = 80;
		} else {
			rideRate = 80 + (customer.distance() - 4) * 6;
		}

		return rideRate;
	}

	public double printBill(Customer customer) {
		double bill = calculateBill(customer);
		System.out.println(customer.customerName() + " your bill is  Rs." + bill);
		return bill;
	}

}

public class Program1_Arraylist {

	public static void main(String[] args) {

		Customer cust1 = new Customer(1, "Rahul", "Ameerpeth", "Erragadd", 8, "9393923423");
		CustomerService custSer = new CustomerService();
		custSer.addCustomer(cust1);
		custSer.printBill(cust1);
		
		Customer cust3 = new Customer(3, "gthul", "Ameerpeth", "Erragadd", 8, "9393923423");
		CustomerService custSer3 = new CustomerService();
		custSer.addCustomer(cust3);
		custSer.printBill(cust3);

		Customer cust2 = new Customer(2, "jagdish", "begampeth", "panjagutta", 3, "9393922362");
		CustomerService custSer2 = new CustomerService();
		custSer2.addCustomer(cust2);
		custSer2.printBill(cust2);

	}

}
