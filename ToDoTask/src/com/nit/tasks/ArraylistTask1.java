package com.nit.tasks;

import java.util.ArrayList;

public class ArraylistTask1 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Rahul");
		alist.add("Ram");
		alist.add("Tejas");
		alist.add("Mangesh");
		alist.add("Shubham");
		
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Rahul");
		alist1.add("Ram");
		alist1.add("Tejas");
		alist1.add("Mangesh");
		alist1.add("Shubham");
		
		
		
		System.out.println(alist);
		
		System.out.println(alist.get(2));
		alist.add(3,"Manoj");

		System.out.println(alist);
		
		alist1.addAll(2, alist);
		
		System.out.println(alist1);
		System.out.println(); 
		alist.ensureCapacity(4);
	}
}
