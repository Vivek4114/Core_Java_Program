package com.nit.deadlockSituation;

class Test1 implements Runnable {

	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

class Test2 implements Runnable {
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

public class Program1_multithreading {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		Test1 t2 = new Test1();

		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();

//		t1.start();
//		t2.start();

	}

}
