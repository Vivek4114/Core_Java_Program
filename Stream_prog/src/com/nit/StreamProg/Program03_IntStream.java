package com.nit.StreamProg;
import java.util.List;
import java.util.stream.Collectors;

public class Program03_IntStream {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("Janvi", "Riya","Piyu","Shraddha","Utkarsha","Tamnha");
		
		list
		.stream()
		.mapToInt(s -> s.length())
		.boxed()
		.collect(Collectors.toList()) 
		.forEach(s-> System.out.print(s + " "));
		System.out.println("=====================================");
		
		List<Integer> li = List.of(39,293,493,9,49);
		li
		.stream()
		.mapToLong(n -> n * 2)
		.boxed()
		.collect(Collectors.toList())
		.forEach(s->System.out.print(s + " "));
		System.out.println("=====================================");
		
		List<Integer> lis = List.of(39,293,493,9,49);
		lis
		.stream()
		.mapToDouble(n -> n * 2 + n *  1 )
		.boxed()
		.collect(Collectors.toList())
		.forEach(s->System.out.print(s + " "));
	}

}
