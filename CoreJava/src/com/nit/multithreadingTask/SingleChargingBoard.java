package com.nit.multithreadingTask;

class ExtensionBox{
	boolean isRikam = false;
	
	public synchronized void plugin(String person) {
		while(isRikam) {
			System.out.println(person + " mi vat Bhagat aahe lavdya lav kar board la");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		isRikam= true;
		System.out.println(person + " mi board la charger laval tu Thamb");
	}
	
	public synchronized void plugOut(String person) {
		isRikam = false;
		System.out.println(person + " charger kadhal tu lav yedi gand");
		notify();
	}
}

public class SingleChargingBoard {
	public static void main(String[] args) {
		
		ExtensionBox e = new ExtensionBox();
		
		Thread th1 = new Thread( () -> { 
			
			e.plugin("Dalindar Dhanush ");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.plugOut("Dalindar Dhanush");
		} );
		
		Thread th2 = new Thread( () -> { 
			
			e.plugin("Chutiya laxmikant  ");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.plugOut("Chutiya laxmiknant");
		} );
		
		th1.start();
		th2.start();
		
	}

}
