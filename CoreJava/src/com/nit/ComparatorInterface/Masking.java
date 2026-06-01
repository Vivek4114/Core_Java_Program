package com.nit.ComparatorInterface;

import java.util.ArrayList;

public class Masking {
public static void main(String[] args) {
	ArrayList<String> str = new ArrayList<String>();
	ArrayList<String> str2 = new ArrayList<String>();
	str.add("VivekDhule@gmail.com");
	str.add("9876765456");
	str.add("rahulGaikwad@gmail.com");
	str.add("9876765456");
	str.add("chanduBodke@gmail.com");
	str.add("9876765456");
	
	
	for(String s : str) {
		String db1 = "";
		if(s.contains("@gmail.com")) {
			int len = s.length()-14;
			for(int i = 0; i<s.length(); i++) {
				if(i<len) {
					db1 = db1 + "*";
				}else {
					db1 = db1 + s.charAt(i);
				}
			}
		str2.add(db1);
			
		}else {
			
			for(int j = 0; j < s.length(); j++) {
				if(j< 6) {
					db1 = db1 + "*";
				}
				else {
					db1 = db1 + s.charAt(j);
				}
			}
			
			str2.add(db1);			
		}
	}
	
	str2.forEach(System.out::println);
}
}
