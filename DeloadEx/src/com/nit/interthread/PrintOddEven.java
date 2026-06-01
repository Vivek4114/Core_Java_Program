package com.nit.interthread;




class printNumber  {
	  int first = 1;
	  int last = 20;
	 
	public synchronized void printEven() {

		while (first <= last) {

			if (first % 2 != 0) {

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println(first + ": Even");
				first++;
				notify();
			}
		}

	}

	public synchronized void printOdd() {

		while (first <= last) {
			if (first % 2 == 0) {

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			else {
				System.out.println(first + ": Odd ");
				first++;
				notify();
			}
		}

	}
}

public class PrintOddEven {

	public static void main(String[] args) {
		printNumber pn = new printNumber();

		new Thread(()-> pn.printEven()).start();;
		new Thread(()-> pn.printOdd()).start();;
		 
		 

	}

}
