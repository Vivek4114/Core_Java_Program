package com.nit.StreamProg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class Program04_FlatmaptoInt {
	
	public static void main(String[] args) {
//		int a1[] = new int[] {28,29,39,40};
//		int a2[] = new int[] {4,79,9,67};
//		int a3[] = new int[] {8,2,3,54};
//		int a4[] = new int[] {87,25,78,49};
//		
//		List<int[]> nestArr = List.of(a1,a2,a3,a4);
//		
//		 nestArr
//		.stream()
//		.flatMapToInt(x -> IntStream.of(x))
//		.boxed()
//		.toList().forEach(System.out::println);
//		;
//		Long a1[] = new Long[] {28L,29L,39L,40L};
//		Long a2[] = new Long[] {4L,79L,9L,67L};
//		Long a3[] = new Long[] {8L,2L,3L,54L};
//		Long a4[] = new Long[] {87L,25L,78L,49L};
//		
//		List<Long[]> nestArr = List.of(a1,a2,a3,a4);
//		
//		 long[] array = nestArr
//		.stream()
//		.flatMapToLong(x  -> Arrays.stream(x).mapToLong(s -> s.longValue()))
//		.toArray();
//		
//		 	 
//		 
//	  Arrays.stream(array).forEach(System.out::println);
		
	  double a1[] = new double[] {28L,29L,39L,40L};
	  double a2[] = new double[] {4L,79L,9L,67L};
	  double a3[] = new double[] {8L,2L,3L,54L};
	  double a4[] = new double[] {87L,25L,78L,49L};
	  
	  List<double[]> nestArr = List.of(a1,a2,a3,a4);
	  
	  double[] array = nestArr
			  .stream()
			  .flatMapToDouble(x  -> DoubleStream.of(x) )
			  .toArray();
	  
	  System.out.println(Arrays.toString(array));
	  
	//  Arrays.stream(array).forEach(System.out::println);
	  
	  
	  String str =  "devaa";
	  Optional<String> ofNullable = Optional.ofNullable(str);
	  
	 if(ofNullable.isPresent()) {
		 System.out.println("object is not empty");
	 }else {
		 System.out.println("object is  empty");
		 
	 }
	 String orElse = ofNullable.orElse("Element is not present");
	 System.out.println(orElse);
	 
	 List<Optional<String>> li = List.of(
			 Optional.of("hii"),
			 Optional.of("deva"),
			 Optional.of("bhai"),
			 Optional.empty()
			);
	 System.out.println(li);
	 
	 
	 for(Optional<String> st : li) {
		 
		 if(st.isPresent()) {
			 String string = st.get();
			 System.out.println(string);
		 }else {
			 System.out.println("Element is not present");
		 }
	 }
	 
	 Integer i = null;
	 
	 Optional.ofNullable(i).ifPresent(System.out::println)
	 ;
	 
	}

}
