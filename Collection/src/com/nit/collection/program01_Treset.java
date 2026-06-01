package com.nit.collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class program01_Treset {
	
	public static void main(String[] args) {
//		TreeMap<Object,String> t = new TreeMap<Object, String>();
//		
//		t.put(1, "Archana");
//		t.put(3, "Devendera");
//		t.put(4, "Sambhaji");
//		t.put(7, "Bhagat");
//		t.put(6, "Ganesh");
//		t.put(5, "Krushna");
//		
//		System.out.println(t)

		
//		TreeMap<Object ,Object> t = new TreeMap<Object,Object>();
//		t.put("Raju","Seema");
//		t.put("deva", true);
//		t.put("vinay", null);
//		t.put("geeta", 1);
//		displayMap(t);
//		
//		t.forEach((k,v)-> System.out.println("key : "+ k + " Value : "+ v));
	
		
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
		hs.put(3,"Radha");
		//hs.put(5,null);
		hs.put(2, "Amol");
		hs.put(1, "Priyanka");
		hs.put(4,"Pradnya");
		hs.put(12, "Jasmine");
		hs.put(13, "Trupti");
		
		System.out.println(hs);
		//hs.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		}
	
//	public static void displayMap(TreeMap map) {
//		Collection c = map.entrySet();
//		Iterator<Object> i = c.iterator();
//		i.forEachRemaining(System.out::println);
//	}

}
