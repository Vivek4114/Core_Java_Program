package com.nit.collectionQuetion;
import java.util.ArrayList;
import java.util.Iterator;

public class AddingStdName {
	
	
	public static void PrintElementUsingSimpleFor(ArrayList<String> stdList) {
		for(int i = 0; i< stdList.size(); i++) {
			System.out.println(stdList.get(i));
		}
	}
	
	public static void printUsingForEach(ArrayList<String> stdList) {
		
		
		for(String st : stdList)
		{
			System.out.println(st);
		}
		
	}
	
	
	public static void printUsingIterator(ArrayList<String> stdList) {
		
		
		System.out.println("--------------------");
		
		Iterator<String> itr =  stdList.iterator();
		
		 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------");
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> stdList = new ArrayList();
		
		stdList.add("Vivek");
		stdList.add("Rahul");
		stdList.add("Jagdish");
		stdList.add("Chandu");
		
		PrintElementUsingSimpleFor(stdList);
		
		System.out.println();
		
		printUsingForEach(stdList);
		
		System.out.println();
		
		printUsingIterator(stdList);
		
		
	}

}
