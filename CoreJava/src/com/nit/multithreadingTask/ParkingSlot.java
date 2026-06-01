package com.nit.multithreadingTask;

class Parking {	
	
 	boolean isParked = true;
	
	public synchronized void parked(String carName) {
		 
		while(!isParked) {
			
			
			try {
				System.out.println(carName + " is Waiting Outside..!"+Thread.currentThread().getName());
				wait();
			}catch( InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		isParked = false;
		System.out.println(carName + " is Parked");
	}
	
	public synchronized void leave(String carName) {
		//isParked = false;
		
		System.out.println(carName + " left the Parking");
		notify();
		isParked=true;
		
		
	}
	
}



class Car implements Runnable{
	String carName;
	
	Parking p;
	Car(Parking p,String carNmae){
		this.carName = carNmae;
		this.p = p;
		
	}
 
	@Override
	public void run() {
		p.parked(carName);
		
		try{
			Thread.sleep(2000);
		} catch( InterruptedException e) {
			e.printStackTrace();
		}
		
		p.leave(carName);
	
	
	}
	
}

public class ParkingSlot {
	public static void main(String []args) {
		Parking p = new Parking();
		
		Car c1 = new Car( p,"A");
		Car c2 = new Car(p,"B");
		
		Thread th = new Thread(c1 ,"a");
		Thread th2=new Thread(c2,"b");
		th.start();
		th2.start();
		
		
		
	}

}

