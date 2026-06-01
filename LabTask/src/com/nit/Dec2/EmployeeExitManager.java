package com.nit.Dec2;

import java.util.LinkedList;

public class EmployeeExitManager {
	  LinkedList<String> stdList = new LinkedList<String>();
	 
	public void clearList() {
		stdList.clear();
		
		
	}
	public void displaySize() {
		System.out.println(stdList);
		
	}
	public static void main(String[] args) {
		EmployeeExitManager em = new EmployeeExitManager();
		em.stdList.add("Amit");
		em.stdList.add("Pooja");
		em.stdList.add("Samiksha");
		em.clearList();
		em.displaySize();
	 
		 
	}

}
