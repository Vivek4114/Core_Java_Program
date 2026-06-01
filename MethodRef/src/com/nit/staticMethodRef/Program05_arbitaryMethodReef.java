package com.nit.staticMethodRef;

import java.util.function.Function;

public class Program05_arbitaryMethodReef {
	
	public static void main(String[] args) {
		
		Function<String, String> fn = String::toUpperCase;
		 System.out.println( fn.apply("Vivek"));
		 System.out.println( fn.apply("Raju"));
		 
	}

}
