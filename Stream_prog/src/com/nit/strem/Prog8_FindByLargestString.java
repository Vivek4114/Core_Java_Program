package com.nit.strem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog8_FindByLargestString {

	public static void main(String[] args) {

		String str = "i am learning java";

		String[] split = str.split(" ");

		String string = Arrays.stream(split).max((a, b) -> a.compareTo(b)).get();
		System.out.println(string);
		System.out.println("===================================");

		Stream<String> stream = Arrays.stream(split);
		List<Integer> collect = stream.map(s -> s.length()).collect(Collectors.toList());

		collect.forEach(System.out::println);
		System.out.println("===================================");
		Integer value = collect.stream().sorted((a, b) -> b.compareTo(a)).findFirst().get();
		System.out.println(value);

		String s = "dabcadefg";

		String[] split2 = s.split("");
		Arrays.stream(split2).distinct().forEach(System.out::print);

		System.out.println("\n===================================");
		String s1 = "I am learning streams API in Java";

		String string2 = Arrays.stream(s1.split(" "))
				.distinct()
				.sorted((a, b) -> Integer.compare(b.length(), a.length()))
				.skip(1).
				findFirst().orElse("");
		System.out.println(string2);

	}

}
