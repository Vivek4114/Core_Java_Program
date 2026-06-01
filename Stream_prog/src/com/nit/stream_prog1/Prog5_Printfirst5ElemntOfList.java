package com.nit.stream_prog1;

import java.util.List;
import java.util.Optional;

public class Prog5_Printfirst5ElemntOfList {

	public static void main(String[] args) {

		List<Integer> of = List.of(292, 26, 22, 21, 24, 26, 22, 82, 24, 5, 5, 33, 2, 2, 2, 4, 5, 5, 6, 7);

		of.stream().distinct().limit(120).forEach(System.out::println);
		System.out.println("============================");
		of.stream().distinct().skip(3).forEach(System.out::println);

		System.out.println("============================");

		System.out.println("second ele element");

		System.out.println("============================");
		of.stream().distinct().sorted((b, a) -> Integer.compare(a, b)).skip(1).limit(1).forEach(System.out::println);
		
		System.out.println("\n============================");

		of.stream().distinct().peek(s-> System.out.print(s + " ")).filter(a -> a%2==0).forEach(b-> System.out.print(b + " "));
	}

}
