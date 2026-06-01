package com.nit.lambda;

import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;

public class Program01_IterateThowEle {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		
		Consumer<Integer> cs = num -> System.out.println(num);
		v.forEach(cs);
		
		System.out.println("=========================");
		Spliterator<Integer> spliterator = v.spliterator();
		spliterator.forEachRemaining(System.out::println);
		
		System.out.println("=========================");
		
		v.stream().forEach(System.out::println);
		System.out.println("=========================");
		
		v.parallelStream().forEach(System.out::println);
	}
}
