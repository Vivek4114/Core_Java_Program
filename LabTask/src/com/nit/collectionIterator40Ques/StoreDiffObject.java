package com.nit.collectionIterator40Ques;

import java.util.Vector;

public class StoreDiffObject {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		
		System.out.println("Capacity " + v1.capacity());
		System.out.println();
		
		v1.add(10);
		v1.add("Ramesh");
		v1.add(33.4);
		v1.add(true);
		v1.add('B');
		v1.add(false);
		v1.add(382.4);
		
		
		//v1.removeElementAt(4);
		
		v1.trimToSize();
		System.out.println("Capacity " + v1.capacity());
		System.out.println();
		
		v1.remove(5);
		v1.trimToSize();
	 
		v1.add(3, 384);
		v1.add(4, 29);
		v1.add(5, 383);
		//v1.add(9, "Soniya Gandhi");
		v1.add(7, 3093);
		
		v1.replaceAll(a-> 34);
		
		v1.set(1, "Dada");
		v1.set(2, "Bhau");
		v1.set(3, "Mitra");
		v1.set(5, "Jayant");
		v1.set(4, "Ramesh");
		
		System.out.println(); 
		v1.forEach(System.out::println);
		System.out.println("Capacity " + v1.capacity());
		
		
		
		
		Vector v2 = (Vector) v1.clone();
		
		
		
		System.out.println(" \n Element in the V2 is : "+ v2);
	}

}
