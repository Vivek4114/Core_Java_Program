package com.nit.Dec2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentChecker {
	
	public boolean isEnrolled(List<String> students, String name) {
		if(students.contains(name)) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> student = new LinkedList<String>();
		EnrollmentChecker e1 = new EnrollmentChecker();
		student.add("Ramu");
		student.add("Teju");
		student.add("Abhishek");
		student.add("Shri");
		student.add("Gangadhar");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		String stdName = sc.next();
		
		
		boolean result = e1.isEnrolled(student, stdName);
		
		if(result) 
			System.out.println(stdName +" Student is Present in the list");
		
		else 
			System.out.println(stdName + " Student is not present in the list");
		
		System.out.println("\nList of the Student");
		System.out.println(student);
	}

}
