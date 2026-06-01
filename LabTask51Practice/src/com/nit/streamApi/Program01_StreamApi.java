package com.nit.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

record Person(String name, int age, double salary) {
	
}

public class Program01_StreamApi {
	public static void main(String[] args) {
		
		 
		Person p1 = new Person("Raj", 20, 10000);
		Person p2 = new Person("Yaman", 18, 48000);
		Person p3 = new Person("Ravi", 30, 26000);
		Person p4 = new Person("Jagganath", 23, 37000);
		Person p5 = new Person("Shiva", 27, 25000);
		Person p6 = new Person("Shivam", 12, 36000);
		Person p7 = new Person("Kishor", 37, 42000);
		
		List<Person> li =  Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		li.stream().sorted(Comparator.comparing(p-> p.name())).forEach(System.out::println);
		
		
	}

}
