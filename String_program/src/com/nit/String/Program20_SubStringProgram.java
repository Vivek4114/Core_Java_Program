package com.nit.String;

import java.util.Arrays;

public class Program20_SubStringProgram {
	
	public String largestOddNumber(String s) {
	    for (int i = s.length() - 1; i >= 0; i--) {
	        char ch = s.charAt(i);
	        
	        if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
	            
	            String result = s.substring(0, i + 1);
	            
	            int start = 0;
	            while (start < result.length() - 1 && result.charAt(start) == '0') {
	                start++;
	            }
	            
	            return result.substring(start);
	        }
	    }
	    
	    return "";
	}
	
	public static void main(String[] args) {

		String s1 = "0000293390";

		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				String substring = s1.substring(i, j);
				int no = Integer.parseInt(substring);
				if ((no % 10) % 2 != 0) {
					System.out.println(no);
					s2 += no + " ";

				}
			}
		}

		String strArr[] = s2.split(" ");

		int largest = Integer.parseInt(strArr[0]);
		for (int i = 0; i < strArr.length; i++) {

			for (int j = i + 1; j < strArr.length - 1; j++) {
				int num = Integer.parseInt(strArr[j]);
				if (largest < num) {
					largest = num;
				}
			}


		}
		System.out.println("Largest No In Substring is :  " + largest);

		System.out.println(Arrays.toString(strArr));

	}

}