package com.nit.AmazonBasedProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
	 
	
 
	LinkedList<Product1> cart = new LinkedList<Product1>();
	
	public void addProduct11(Product1 p) {
		  cart.add(p);
	}
	
	public void removeProduct1(Product1 p) {
		cart.remove(p);
	}
	
	public void mostRecentlyView(Product1 p) {
		 cart.add(p);
	}
	
	public void displayCartItem() {
		cart.forEach(System.out::println);
	}
}
