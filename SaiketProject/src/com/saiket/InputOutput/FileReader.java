package com.saiket.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("in the file we are storing the student details : ");
		System.out.println("Enter the Student Id : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the age of student : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the standard : ");
		int std = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the description : ");
		String description = sc.nextLine();

		Student stu = new Student(id, name, age, std, description);

		try {
			FileOutputStream fos = new FileOutputStream("d:\\demofiles\\msg.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(stu);
			 
			System.out.println("Serilization operation is perform");

		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		String path = "d:\\demofiles\\msg.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student std1 = (Student) ois.readObject();
			System.out.println(std1);
			System.out.println("Deserilization operation perfrom");
			ois.close();
			fis.close();

 
			System.out.println("\n Data is printed successfully\n Deserilization operation is perform");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

record Student(int id, String name, int age, int std, String description) implements Serializable {

}
