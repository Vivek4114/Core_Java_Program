package com.nit.stream_prog1;

import java.util.List;

record Employee(String name, double salary) {}

public class Prog3_EmployeeWhichHave25TSalary {
	
	public static void main(String[] args) {
		
		
		List<Employee> list = List.of(
				new Employee("vivek",29292),
				new Employee("Ramesh", 39392),
				new Employee("gita",23383),
				new Employee("chandu",24000),
				new Employee("aachary",39393)			
				
				);
		
		list.stream().distinct().filter( x -> x.salary() >= 25000).forEach(System.out::println);;
		
		System.out.println("=====================================");
		list.stream().forEach(s -> System.out.println("name " + s.name() + " salary : " + s.salary()));
	}

}
