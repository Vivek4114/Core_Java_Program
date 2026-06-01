package com.nit.strem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

record Emp(int empid, String name, double salary) {}

public class Prog1_PrintEmpData {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		List<Emp> of = List.of(
				new Emp(1,"vivek",29292),
				new Emp(3,"jitesh",33399),
				new Emp(2,"vavid",345565),
				new Emp(5,"vayank",86543),
				new Emp(5,"mayank",29383)
				);
		
		
		
		
		of.stream()
		.distinct()
		.peek(s-> System.out.println("Before mapping :" + s))
		.map(v -> v.salary()+50000)
		.peek(s-> System.out.println("after mapping :" + s))
		.forEach(s -> System.out.println(s));
		
		System.out.println("================================");		
		of.stream()
		.distinct()
		.filter(s-> s.salary() > 30000)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		System.out.println("================================");	
		
		List<Integer> list = List.of(12, 22, 28, 82, 68, 98,25,47,94, 44, 99, 77, 55);
		  long count = list.stream().distinct().filter(s->s%2==0).count();
		  System.out.println(count);
		  System.out.println("================================");	
		  
		    int sum = list.stream().mapToInt( Integer::intValue).sum();
		    System.out.println(sum);
		  
		    System.out.println("================================");	
		    System.out.println("================================");	
		    System.out.println("================================");	
		    
		    Integer reduce = list.stream().distinct().reduce(Integer.MAX_VALUE, (a,b)-> a<b?a:b)
		    		;	    
		    Optional<Integer> max = list.stream().distinct().reduce(Integer::min);
		   
		    System.out.println( max.get());
		    System.out.println("================================");	
		    
		    List<String> strList = List.of("vivek","Tejas","Anil","karan");
		    String reduce2 = strList.stream().distinct().reduce("",(a,b)-> a + " "+ b);
		     Integer multiple = list.stream().distinct().reduce(1, (a,b)-> a*b);
		    System.out.println(multiple);
		    
		    Optional<Emp> any = of.stream().filter(s -> s.name().equals("vivek")).findAny();
		    System.out.println(any.get());
		    
		    
		    System.out.println("===================");
		    List<String> l1 = Arrays.asList("Java", "AI", "Spring", "Code");

		    Optional<String> result = l1.stream()
		                                  .filter(s -> s.length() > 4) // condition
		                                  .findFirst();

		    result.ifPresent(System.out::println);
		    
		    System.out.println("==============================");
		    
		    
		   list.stream().anyMatch(s-> s%2==0);
		   
		   
		    
		    
	}
}
