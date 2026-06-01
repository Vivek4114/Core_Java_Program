package com.nit.fun;

import java.util.Arrays;

public class Reserch {
	
	public static void main(String[] args) {
		
		 String str =  "vivek";
		 byte[] array = str.getBytes();;
		 System.out.println(Arrays.toString(array));
		 int count = 0;
		 
		 for(byte a: array) {
			 
			 count++;
			 
			 			 
		 }
		 
		 System.out.println(count);
	}

}
