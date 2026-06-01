package com.nit.stream_prog1;

import java.util.List;

record Emply(String name, double salary) {
}

public class Prog3_sortingEmployee {

	public static void main(String[] args) {

		List<Emply> list = List.of(new Emply("vivek", 29292), 
				new Emply("ramesh", 39392),
				new Emply("Gisldfjta", 23383),
				new Emply("chandu", 24000),
				new Emply("aachary", 39393)

		);

		list.stream().distinct().filter(x -> x.salary() >= 25000).forEach(System.out::println);
		;

		System.out.println("=====================================");
		
		list.stream().distinct().sorted( (a,b) -> Double.compare(a.salary(), b.salary()) ).forEach(System.out::println);
		System.out.println("===========================================");
		list.stream().distinct().sorted( (a,b) ->  a.name().compareToIgnoreCase(b.name()) ).forEach(System.out::println); 
		 
	}

}
