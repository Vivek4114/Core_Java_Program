package in.technohacks.task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("in the file we are storing the student details : ");
		System.out.println("Enter the Student Id : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the age of student : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the stdandar : ");
		int std = Integer.parseInt(sc.nextLine());
		
		Student stu = new Student(id, name, age, std);
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\demofiles\\msg.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(stu);
			fos.close();
			out.close();
			System.out.println("Serilization operation is perform");
			 
			 
		} catch (IOException e) {
			 
			e.printStackTrace();
		}

		String path = "d:\\demofiles\\msg.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);

			int i;
			while (true) {
				i = fis.read();

				if (i == -1) {
					break;
				}

				System.out.print((char) i + "");

			}
			System.out.println("\n Data is printed successfully\n Deserilization operation is perform");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

record Student(int id, String name, int age, int std) {

}
