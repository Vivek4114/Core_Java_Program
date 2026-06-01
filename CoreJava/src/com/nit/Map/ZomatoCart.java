package com.nit.Map;

import java.util.HashMap;
import java.util.Map;


/*
 *  -Allow the user to add food items into a cart, where each entry will have food name and its price.
-Allow the user to modify the cart by removing a particular food item
- Display the updated cart and total price to be paid by the user. 
*/

public class ZomatoCart {
	public static void main(String[] args) {
		Map<String, Double> cart = new HashMap<String, Double>();
		cart.put("Biryani",  180.0);
		cart.put("Kaju Panner", 292.0);
		cart.put("Garlic Nan", 30.0);
		cart.put("coke", 40.0);
		
		System.out.println("Food Item Added into Cart : ");
		System.out.println(cart);
		
		cart.remove("coke");
                                                                                        		
		System.out.println("After Updated Food Item : ");
		System.out.println(cart);
		double totalBill=0;
		
	//	cart.forEach((e,d)->System.out.println(e+" "+d));
		
		for(Map.Entry<String, Double> e: cart.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			totalBill += e.getValue();
			
		}
		
		System.out.println("Total Bill is " + totalBill);
		
		
		
		
	}

}
