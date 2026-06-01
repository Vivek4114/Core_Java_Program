package com.nit.methodReference;

import java.util.Scanner;
import java.util.function.Function;
 

class Patient {
	String name;

	Patient(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

}

public class PatientRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.next();
//		Patient p = new Patient(name);

		Function<String, Patient> fun = Patient::new;
		System.out.println(fun.apply(name));

	}

}
