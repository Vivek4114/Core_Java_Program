package com.nit.multithreadingTask;

class User{
	
boolean isPrinting = false;

	public synchronized void printPaper(String personName) {
		
		while(isPrinting) {
			System.out.println(personName + " Waiting for Printing..!");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		isPrinting = true;
		System.out.println(personName + " Printing the Paper ");
		
	}
	
	public synchronized void printingOver(String personName) {
		isPrinting = false;
		notifyAll();
		System.out.println(personName + " Priting is Over");
	}
	
}


public class Printer {
	
	public static void main(String[] args) {
		User user = new User();
		
		Thread th1 = new Thread ( ()-> { 
			user.printPaper("Vivek");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			user.printingOver("Vivek");
		} );
		
		Thread th2 = new Thread ( ()-> { 
			
			user.printPaper("jagu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
			 
				e1.printStackTrace();
			}
			user.printingOver("jagu");
		} );
		
		Thread th3 = new Thread ( ()-> { 
			
			user.printPaper("chandu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
			 
				e1.printStackTrace();
			}
			user.printingOver("chandu");
		} );
		
		
		th1.start();
		th2.start();
		th3.start();
	}
	

}
