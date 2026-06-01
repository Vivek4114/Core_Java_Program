package com.nit.program;

import java.util.Map;
import java.util.stream.Collectors;

public class CountTheWords {

	public static void main(String[] args) {
		
		String str = "javajavaString";
		
		 Map<Character, Long> collect = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(d-> d,Collectors.counting()));
		 System.out.println(collect);
	}
}
