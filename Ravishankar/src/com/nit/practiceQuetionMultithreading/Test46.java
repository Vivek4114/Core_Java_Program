package com.nit.practiceQuetionMultithreading;

 
public class Test46 {
	public static void main(String argv[]) {
		Test1 pm1 = new Test1("One");
		pm1.run();
		Test1 pm2 = new Test1("Two");
		pm2.run();

	}
}

class Test1 extends Thread {
	private String sTname = "";

	Test1(String s) {
		sTname = s;

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
			}
			Thread.yield();
			System.out.println(sTname);
		}

	}
}