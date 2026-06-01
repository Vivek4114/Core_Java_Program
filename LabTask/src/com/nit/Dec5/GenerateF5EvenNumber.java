package com.nit.Dec5;

import java.util.stream.Stream;

public class GenerateF5EvenNumber {

	public static void main(String[] args) {
		Stream<Integer> evenNum = Stream.iterate(2, n -> n+2).limit(5);
		evenNum.forEach(System.out::println);
	}

}
