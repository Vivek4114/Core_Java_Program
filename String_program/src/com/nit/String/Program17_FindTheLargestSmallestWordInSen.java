package com.nit.String;


public class Program17_FindTheLargestSmallestWordInSen {
	public static void main(String[] args) {

		String s1 = "The quick brown fox jumps over the lazy dogddd";

		String[] strArr = s1.split(" ");
		String whLargest = "";
		int largest = strArr[0].length();
		for (int i = 1; i < strArr.length; i++) {
			if (largest < strArr[i].length()) {
				largest = strArr[i].length();
				whLargest = strArr[i];
				
			}
		}
		System.out.println(whLargest + "   : is largest String Having Size  : " + largest);
	}
}
