package com.nit.String;

public class Program14_RemoveDuplicate {
	public static void main(String[] args) {
		
		String s1 = "abcdabcdabc";
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			int c = 0, v= 0;
			for (int j = 0; j < s1.length(); j++) {
				
				if(s1.charAt(i) == s1.charAt(j) &&  i>= j) c++;
				if(s1.charAt(i) == s1.charAt(j) &&  i < j) v++;
				
			}
			
			if(c>=1 && v==0) {
				 s2 += s1.charAt(i);
			}
			
		}
		
		System.out.println("without duplicate String is : "+ s2);
		
		System.out.println("===================================");
		
		String str = "vivekvivekvivek";
		String str1 = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(str1.indexOf(ch) == -1) {
				str1 += ch;
			}
			
		}
		
		System.out.println("After the duplicate removing  : " +str1);
		System.out.println("===================================");
		
		String s = "abcdef";
		
		int indexOf = s.indexOf("c");
		System.out.println(indexOf);
	}

}
