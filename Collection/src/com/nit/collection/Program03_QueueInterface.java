package com.nit.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program03_QueueInterface {
	
	public static void main(String[] args) {
//		
//		Queue<String> q = new PriorityQueue<String>();
//		q.add("Orange");
//		q.add("Grapes");
//		q.add("Turmeric");
//		q.add("Mango");
//		q.add("Pinaple");
//		q.add("Black Berry");
//		q.add("Apple");
//		
//		System.out.println(q);
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(209);
		q.add(10);
		q.add(2);
		q.add(9);
		q.add(109);
		q.add(21);
		q.add(14);
		q.add(11);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q);
				
	}

}
