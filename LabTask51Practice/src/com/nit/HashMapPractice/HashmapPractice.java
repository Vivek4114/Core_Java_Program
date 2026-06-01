package com.nit.HashMapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashmapPractice {
	public static void main(String[] args) {

		HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
		Scanner sc = new Scanner(System.in);
		
		 
		while(true) {
			System.out.println("--- Course Registration Menu ---\n"
					+ "1. Register student to course [use V computeIfAbsent(key, Function<T,R>)]\n"
					+ "2. Remove student from course [use V computeIfPresent(key, BiFunction<T,U,R>)]\n"
					+ "3. View course-wise student list\n" + "4. Exit\n" + "Enter your choice:  \n");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter the Course name : ");
				String course = sc.nextLine();
				System.out.println("Enter the Student name : ");
				String stdName = sc.next();
//				List<String> studentsList = hmap.computeIfAbsent(course, k -> new ArrayList<>());
//			    studentsList.add(stdName);
				
				hmap.computeIfAbsent(course,k-> new ArrayList<String>()).add(stdName);
			    System.out.println(stdName + " registered to " + course);
			}
				break;
			case 2: {
				System.out.println(hmap);
			}
				break;
			case 3: {
				System.out.println("Enter The Course Name : ");
				String course = sc.nextLine();
				System.out.println("Enter the Student to remove from the list : ");
				String stdName = sc.nextLine();
				hmap.remove(stdName);

			}
				break;

			case 4: {
				System.out.println("Thank Your for useing our application ");
				System.exit(0);
				return ;

			}
			}
		 
		
		
		}
	}

}
