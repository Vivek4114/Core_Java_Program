package com.nit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {
	
	public static void main(String[] args) {
		
		List<Employee> list1 = new ArrayList<Employee>();
		
		list1.add(new Employee(2, "rohit",23948d, "sales"));
		list1.add(new Employee(5, "reman",2342235, "qa"));
		list1.add(new Employee(6, "rushi",65456, "it"));
		list1.add(new Employee(1, "vivek",2929d, "it"));
		list1.add(new Employee(4, "amar",23425, "cs"));
		list1.add(new Employee(3, "virat",35435d, "it"));
		
//		System.out.println("===================Before Sorting============\n");
//		list.forEach(System.out::println);
//		Collections.sort(list);
//		System.out.println("===================after Sorting============\n");
//		list.forEach(System.out::println);
		
		List<Product> list  = new ArrayList<Product>();
		Product p = new Product();
		list.add(new Product(1, "cake", 342342342));
		list.add(new Product(2, "cooker", 23424));
		list.add(new Product(5, "chair", 456456));
		list.add(new Product(4, "thaila", 46546));
		list.add(new Product(3, "mixer", 2234242));
		
		System.out.println("===================Before Sorting============\n");
		list.forEach(System.out::println);
		Collections.sort(list,p);
		System.out.println("===================after Sorting============\n");
		list.forEach(System.out::println);
		
		
		System.out.println("===================after Sorting============\n");
		Comparator<Product> com = new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
			 
				return o2.getProductName().compareTo(o1.getProductName());
			}
		};
		
		Collections.sort(list,com);
		
		 
		
	
		list.forEach(System.out::println);
		System.out.println("===================after Sorting============\n");		 
		Collections.sort(list1, (e1, e2)-> e1.getId()-e2.getId());
		list.forEach(System.out::println);
		System.out.println("===================after Sorting============\n");		 
	}

}
