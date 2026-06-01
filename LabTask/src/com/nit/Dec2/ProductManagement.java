package com.nit.Dec2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ProductManagement {
	ArrayList<String> prodList = new ArrayList<String>();
	Deque<String> deq = new LinkedList<String>(prodList);
	
	
	public void addFirst1(String item) {
		deq.addFirst(item);
	}
	
	public void addLast1(String item) {
		deq.addLast(item);
	}
	
	public void addItem(String item) {
		deq.add(item);
	}
	
	public void display() {
		System.out.println(deq);
	}
	public static void main(String[] args) {
		ProductManagement p1 = new ProductManagement();
		 p1.addItem("Pen");
		 p1.addItem("Pencil");
		 p1.addItem("Earaser");
		 
		 p1.addFirst1("Scale");
		 p1.addLast1("Mouse");
		 
		 p1.display();
		
		
	 
	}

}
