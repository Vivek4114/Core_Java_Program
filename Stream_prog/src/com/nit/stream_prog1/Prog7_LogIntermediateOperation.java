package com.nit.stream_prog1;

import java.util.List;
import java.util.stream.Collectors;

public class Prog7_LogIntermediateOperation {
	
	public static void main(String[] args) {
		
		List<Integer> of = List.of(2,3,4,5,6,7,8,9,9,10,1);

		of.stream().
		distinct().
		peek(s-> System.out.println(s+" Before Mapping"))
		.map(s-> s*s)
		.peek(v -> System.out.println(v + " after mapping"))
		.collect(Collectors.toList()).
		forEach(s->System.out.print(s + "  "));
		
	}

}
