package com.nit.AdditionTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

record Customer(int id, String name, double bill ) {
	  
  }

public class Program1_comparator {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Size of the Element : ");
		 int size = sc.nextInt();
		 Customer arr[] = new Customer[size];
		 for(int i=0; i<size; i++) {
			 System.out.println("Enter the Id : ");
			 int id = sc.nextInt();sc.nextLine();
			 
			System.out.println("Enter the Name of the Customer ");
			String name = sc.nextLine();
			
			System.out.println("Enter the Bill : ");
			double bill = sc.nextDouble();
		
			 arr[i] = new Customer(id, name , bill);
			 
			 
		 }
		 System.out.println("Original Data Element : ");
		 System.out.println(" \n " + Arrays.toString(arr));
		 
		 Comparator<Customer> ele = (e1, e2) -> Integer.compare(e1.id(), e2.id());
		 
		 Arrays.sort(arr,ele);
		 System.out.println("\n Sort by useng the Id ");
		 for (Customer customer : arr) {
			System.out.println(customer);
		 }
		 
		 Comparator<Customer> ele1 = (e1, e2) ->  e1.name().compareTo(e2.name());
		 
		 Arrays.sort(arr,ele1);
		 System.out.println("\n Sort by useng the name  ");
		 for (Customer customer : arr) {
			System.out.println(customer);
		 }
		 
		 Comparator<Customer> ele2 = (e1, e2) ->   Double.compare(e1.bill(), e2.bill());
		 
		 Arrays.sort(arr,ele2);
		 System.out.println("\n Sort by useng the Bill  ");
		 for (Customer customer : arr) {
			 System.out.println(customer);
		 }
		 
		 
	}
}
