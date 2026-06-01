package com.nit.program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {
	
	public static void main(String[] args) {
		
		Stream<Double> stream = Stream.generate(()-> Math.random());
		stream.limit(5).forEach(System.out::println);
		System.out.println("========================================");
		Stream<Integer> iterate = Stream.iterate(1, n-> n+2);		
		iterate.limit(10).forEach(System.out::println);
		System.out.println("========================================");
		
		Stream<Integer> of = Stream.of(1,2,3,4,5,6,7,8,9);
		of.forEach(System.out::println);
		System.out.println("========================================");
		//of.forEach(System.out::println);
		
		List<Integer> asList = Arrays.asList(1,3,4,5,6,7,8,8,8,8,8,6,2,11,10);
		asList.stream().filter(n -> n%2==0).forEach(System.out::println);
		System.out.println("========================================");
		
			List<String> of2 = List.of("Aniket", "Aryant", "Java", "Abhishek","Rahul","Manoj" ,"Anuj", "Raghu", "Priya");
			Set<String> collect = of2.stream().filter(s -> s.startsWith("R")).collect(Collectors.toSet());
			System.out.println(collect);
			
			
			System.out.println("========================================");
			List<Integer> asList1 = Arrays.asList(1,3,4,5,6,7,8,8,8,8,8,6,2,11,10);
			asList1
			.stream()
			.distinct()
			.filter(n -> n%2==0)
			.map(v -> v*v*v)

			.collect(Collectors.toList())
			.forEach(System.out::println);
			
	}

}
