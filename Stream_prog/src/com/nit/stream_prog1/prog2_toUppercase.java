package com.nit.stream_prog1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class prog2_toUppercase {

	public static void main(String[] args) {

		List<String> list = List.of("Amar", "Suresh", "Ramesh", "Swapnil", "Diwakar", "Diwakaa", "Amarkant");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println(list);

		System.out.println("==============================");
		System.out.println("Start Character with");

		list.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);
		System.out.println("===========================");

		List<Integer> list1 = List.of(11, 43, 5, 22, 4, 5, 6, 66, 2, 44, 5, 66, 4, 3, 2, 2, 2, 4, 455, 99);
		List<Integer> list2 = List.of(23, 73, 88, 66, 94, 93, 74, 62, 73, 86, 83, 84, 99);
		
		

		Optional<Integer> max = list1.stream().distinct().max((a, b) -> Integer.compare(a, b));
		System.out.println(max.get());
		System.out.println("===========================");
		System.out.println("===========================");

		list.stream().distinct().map(String::toUpperCase).sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
		;
		System.out.println("===========================");
		System.out.println("===========================");

		list1.stream().flatMap(a -> list2.stream()).distinct().forEach(System.out::println);
		System.out.println("===========================");
		
		Double collect = list1.stream().collect(Collectors.averagingInt(a-> a));
		System.out.println(collect);
		
		System.out.println("===========================");
		
		
		List<String> stringEle = list1.stream().distinct().map(s-> Integer.toString(s)).collect(Collectors.toList());
		System.out.println(stringEle);
		
	}

}
