package com.nit.Map;

import java.util.HashMap;
import java.util.Map;

public class AmazonCartSystem {
	public static void main(String[] args) {
		Map<String,Double> item = new HashMap<String, Double>();
		
		item.put("TV",20000.0);
		item.put("Washing Machine",14000.0);
		item.put("Fridge",22000.0);
		item.put("Rack",2000.0);
		
		item.forEach((i,p) -> System.out.println(i+ " Rs : " + p));
		System.out.println();
		
		
		double totalBill = 0;
		for(Map.Entry<String, Double> itm : item.entrySet()) {
			totalBill += itm.getValue();
		}
		
		System.out.println("Total Amount to be paid : " + totalBill);
	boolean 	paymentDone = false;
	
		if(paymentDone == true) {
			item.clear();
		}
		
		if(item.isEmpty()) {
			System.out.println("No Products Available in Cart. Add Product");
		}else {
			item.forEach((i,p) -> System.out.println(i+ " Rs : " + p));
			
		}
		
		
	}

}
