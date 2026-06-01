package com.nit.deadlockSituation;

class one extends Thread {
	InterThreadComm itc;

	one(InterThreadComm itc) {
		this.itc = itc;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				itc.produce(i);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class two extends Thread {
	InterThreadComm itc;

	two(InterThreadComm itc) {
		this.itc = itc;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				itc.consumer();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadComm {

	int data;
	boolean availble = false;

	public synchronized void produce(int value) throws InterruptedException {
		while (availble) {
			wait();
		}

		data = value;
		availble = true;
		System.out.println("Producer : " + value);
		notify();
	}

	public synchronized int consumer() throws InterruptedException {
		while (!availble) {
			wait();
		}
		availble = false;
		System.out.println(" consumer : " + data);
		notify();
		return data;
	}

	public static void main(String[] args) {

		InterThreadComm itc = new InterThreadComm();

//		Thread produce = new Thread(() -> {
//
//			for (int i = 1; i <= 10; i++) {
//				try {
//					itc.produce(i);
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//
//		Thread consumer = new Thread(() -> {
//
//			for (int i = 1; i <= 10; i++) {
//				try {
//					itc.consumer();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});

		one produce = new one(itc);
		two consumer = new two(itc);

		produce.start();
		consumer.start();

	}

}
