package com.nit.AmazonBasedProject;

import java.util.ArrayList;

class Catalog1{
	
	ArrayList<Product1> prodList = new ArrayList<Product1>();
	
	public void addProduct11(Product1 p) {
		prodList.add(p);
	}
	
	public void removeProduct1(Product1 p) {
		prodList.remove(p);
	}
	
	public void SearchProduct1ByName(String Name) {
		
		for(Product1 p : prodList) {
			if(p.getName().equalsIgnoreCase(Name)) {
				System.out.println(p);
			}
		}
		
	}
	
	public void SearchProduct1ByCategory(String category) {

		for(Product1 p : prodList) {
			if(p.getName().equalsIgnoreCase(category)) {
				System.out.println(p);
			}
		}
		
	}
	
	public void displayAllList() {
		prodList.forEach(System.out::println);
		
		//System.out.print(prodList);
	/*	Iterator<Product1> itr = prodList.iterator();
		
		while(itr.hasNext()) {
			Product1 p = itr.next();
			System.out.println(p);
		 
		}
		
		
		
		prodList.forEach(p -> System.out.println(p));
		
		for(int i = 0; i<prodList.size(); i++) {
			
			System.out.print(prodList.get(i));
			
		}
		
		for(Product1 p : prodList) {
			System.out.println(p);
		}
		*/
	}
}