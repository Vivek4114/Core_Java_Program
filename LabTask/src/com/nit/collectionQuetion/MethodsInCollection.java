package com.nit.collectionQuetion;

import java.util.ArrayList;

public class MethodsInCollection {
	public static void main(String[] args) {
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		s1.add(100);
		s1.add(200);
		s1.add(300);
		
		s2.add(10);
		s2.add(20);
		s1.add(30);	
		
		s1.addAll(s2);
		
		System.out.println(s1);
		
		
		
		
		
	}

}
