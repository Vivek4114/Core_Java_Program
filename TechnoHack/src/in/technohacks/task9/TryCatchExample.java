package in.technohacks.task9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		String name = null;
		int age = 0;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Name : ");
			name = sc.nextLine();
			System.out.println("Enter the  age : ");
			age = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("you enter the Invalid details: ");
			return;
		}

		System.out.println("Your name is :  " + name);
		System.out.println("your age is : " + age);

	}

}
