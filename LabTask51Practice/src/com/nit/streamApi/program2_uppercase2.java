package com.nit.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class program2_uppercase2 {
	public static void main(String[] args) {
		
		List<String> lstr = new ArrayList<String>();
		Stream<Double> random = Stream.generate(Math::random).limit(7);
		random.forEach(System.out::println);
		 
	}

}
