package com.nit.StreamProg;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

record Employee(int id, String name, Double salary) {
};

public class Program02_StreamConcept {

	public static void main(String[] args) {

//		List<Integer> ele = List.of(5, 3, 4, 5, 6, 1, 3, 5, 7, 9, 11, 1, 3, 15, 1, 7, 7, 8, 12, 5, 56, 2, 3, 6, 3, 8);
//		Set<Integer> collect = ele.stream().distinct().filter(s -> s % 2 == 0).collect(Collectors.toSet());
//		System.out.println(collect);

		// AtomicInteger i = new AtomicInteger(10);

//		ArrayList<Employee> alist = new ArrayList<Employee>();
//		alist.add(new Employee(1, "Satish", 28282D));
//		alist.add(new Employee(4, "Ramesh", 60000D));
//		alist.add(new Employee(5, "Suresh", 80000D));
//		alist.add(new Employee(2, "Ganesh", 60987D));
//		alist.add(new Employee(3, "Mahesh", 38924D));
//		alist.add(new Employee(7, "Durgesh", 6528D));
//		alist.add(new Employee(6, "Jitesh", 5028D));
//
//		//int i = 0;
//		alist.stream().filter(p -> p.salary() >= 30000).collect(Collectors.toList())
//				.forEach(s -> System.out.println(i.getAndIncrement() + ")" + " --> " + s.name()));
		
		
//		List<Integer> asList = Arrays.asList(7,4,3,2,6,7,8,6,1,2,3,6,5,4,6,9,7);
//		
//		asList
//		.stream()
//		.distinct()
//		.sorted()	
//		//.filter(s -> s%2 == 0)
//		.map(n -> n * n * n)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
		List<String> indPlayer = Arrays.asList("Rahit","Virat","Sachin","Dhoni","Sehwag");
		List<String> engPlayer = Arrays.asList("Roy","Root","Morgan","Bethal");
		
		List<List<String>> asList = Arrays.asList(indPlayer, engPlayer);
		System.out.println("Usieng flatmap");
		System.out.println(asList);
		asList
		.stream()
		.distinct()
		.flatMap(s-> s.stream())
		.collect(Collectors.toList())
		.forEach(s -> System.out.print(s + " "));

	}

}
