package com.nit.Dec5;

import java.util.stream.Stream;
// of(T ...t):returns a Stream of several element

public class SeveralElement {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("apple","banana", "kiwi","graps");
		stream.forEach(System.out::println);
	}

}
