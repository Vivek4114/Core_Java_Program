package com.nit.stream_prog1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog1_AllEvenNumber {

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		int count = 0;

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				count++;
			}

		}

		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(13);
		list.add(45);
		list.add(52);
		list.add(67);
		list.add(44);
		list.add(17);
		list.add(12);
		list.add(69);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("============================");
		System.out.println("Prime number ");
		System.out.println("============================");
		list.stream().distinct().filter(a -> isPrime(a)).forEach(System.out::println);
		;

		System.out.println("============================");
		System.out.println("============================");
		
		list.stream().map(s -> s*s).forEach(System.out::println);

	}

}
