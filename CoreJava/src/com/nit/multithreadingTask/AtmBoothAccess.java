package com.nit.multithreadingTask;


class ATMBooth {
	boolean isFree = false;
	
	public synchronized void enterBooth(String personName) {
		
		while(isFree) {
			System.out.println(personName + " is Waiting Outside ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		isFree = true;
		System.out.println(personName + " is Entered in booth");
	}
	
	public synchronized void outBooth(String personName) {
		isFree = false;
		notify();
		System.out.println(personName + " is Left from the Booth");
		
	
	}
}

class Person implements Runnable{
	String name; 
	ATMBooth atmBooth;
	public Person(String name, ATMBooth atmBooth) {
		 
		this.name = name;
		this.atmBooth = atmBooth;
	}
	
	
	@Override
	public void run() {
		
		atmBooth.enterBooth(name);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		
		atmBooth.outBooth(name);
	}
	
}

public class AtmBoothAccess    {
	public static void main(String[] args) {
		
		ATMBooth a = new ATMBooth();
	 
		 Thread th1 = new Thread( ()->{
			 
			 a.enterBooth("Vivek");
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			a.outBooth("Vivek");
		 });
		 
		 
		 Thread th2 = new Thread( ()->{
			 
			 a.enterBooth("rahul");
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			a.outBooth("rahul");
		 });
		 
			th1.start();
			th2.start();
			 
			 
		 
		
	}

}
