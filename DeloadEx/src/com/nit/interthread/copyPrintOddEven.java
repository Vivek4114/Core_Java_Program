package com.nit.interthread;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class shared {
	int first = 1;
	int last = 20;
	
List<String> list = new ArrayList<String>();

}



class printOdd extends Thread {
	shared s;

	public printOdd(shared s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {

			while (s.first <= s.last) {

				if (s.first % 2 != 0) {

					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println(s.first + ": Even");
					s.first++;
					s.notify();
				}
			}
		}

	}

}

class printEven extends Thread {
	shared s;

	public printEven(shared s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {

			while (s.first <= s.last) {
				if (s.first % 2 == 0) {

					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				else {
					System.out.println(s.first + ": Odd ");
					s.first++;
					s.notify();
				}
			}
		}
	}

}

public class copyPrintOddEven {

	public static void main(String[] args) {

		shared s = new shared();
		new printEven(s).start();
		new printOdd(s).start();
		SortedSet set = new TreeSet();
	}

}
