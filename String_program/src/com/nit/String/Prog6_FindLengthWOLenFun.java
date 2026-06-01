package com.nit.String;

public class Prog6_FindLengthWOLenFun {

	public static void main(String[] args) {

		String str = "hellow my name is kiran Marotrao Kadam";

		StringBuilder sb = new StringBuilder(str);
		sb.length();

		System.out.println("===================================");
		char[] charArray = str.toCharArray();

		System.out.println(charArray.length);
		System.out.println("===================================");
		int count = 0;

		for (char c : charArray) {
			count++;
		}
		System.out.println(count);
		System.out.println("===================================");

		int c = 0;
		try {
			while (true) {

				str.charAt(c);
				c++;
				
			}
		} catch (Exception e) {
			System.out.println(" sldfjsdf " + c);
		}


	}

}
