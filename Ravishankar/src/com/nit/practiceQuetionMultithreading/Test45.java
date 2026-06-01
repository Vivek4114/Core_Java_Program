package com.nit.practiceQuetionMultithreading;

//Find out the output of the following Program :
public class Test45 extends Thread {
	static String sName = "Mood";

	public static void main(String argv[]) {
		Test45 t = new Test45();
		System.out.println(sName);
		t.nameTest(sName);
	}

	public void nameTest(String sName) {
		sName = sName + " idea ";
		start();
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			sName = sName + " " + i;
		}
	}

}
