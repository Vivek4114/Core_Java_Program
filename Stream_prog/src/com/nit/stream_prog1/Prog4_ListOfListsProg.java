package com.nit.stream_prog1;

import java.util.List;

public class Prog4_ListOfListsProg {

	public static void main(String[] args) {

		List<List<Integer>> list = List.of(List.of(29, 39, 299, 399, 299, 392, 99),
				List.of(22, 44, 5, 6, 7, 7, 5, 43, 55, 22,99, 299));
		
		list.stream().flatMap(s -> s.stream()).distinct().forEach(System.out::println);
	}

}
