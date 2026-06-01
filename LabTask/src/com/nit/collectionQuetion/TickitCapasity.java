package com.nit.collectionQuetion;
import java.util.ArrayList;
import java.util.Iterator;

public class TickitCapasity {
	
	
	public static void dipalayTicketDirectly(ArrayList<Integer> ticket) {
		System.out.println("Dispaly Ticket Directly");
		System.out.println(ticket);
	}
	
	public static void ticketDisplaySimpleFor(ArrayList<Integer> ticket) {
		System.out.println("Dispaly Ticket Simple For");
		
		for(int i = 0 ; i< ticket.size(); i++) {
			System.out.println(ticket.get(i));
		}
		
	}
	
	public static void DisplyTicketForEach(ArrayList<Integer> ticket) {
		System.out.println("Dispaly Ticket  For Each");

		for(Integer i : ticket) {
			System.out.println(i);
		}
	}
	
	public static void displayTicketUseingIterable(ArrayList<Integer> ticket) {
		System.out.println("Dispaly Ticket Iterator Interface");

		Iterator<Integer> itr = ticket.iterator();
		
		while(itr.hasNext())  {
			System.out.println(itr.next());
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
	  
		for(int i = 1; i<=20; i++) {
				num.add(i);
		}
		dipalayTicketDirectly(num);
		
		//ticketDisplaySimpleFor(num);
		
		//displayTicketUseingIterable(num);
		 
		//DisplyTicketForEach(num);
	}
}
