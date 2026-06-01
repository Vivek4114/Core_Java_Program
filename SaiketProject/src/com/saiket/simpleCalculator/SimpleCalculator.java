package com.saiket.simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

	// this method is perform additon operation
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	// this method is perform subtraction operation
	public int sub(int num1, int num2) {

		return num1 - num2;
	}

	// this method is perform multiplication operation
	public double mul(int num1, int num2) {

		return num1 * num2;
	}

	// this method is perform division operation
	public double div(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("=====================================");
			System.out.println("Enter 1 for addition : ");
			System.out.println("Enter 2 for subtraction : ");
			System.out.println("Enter 3 for multiplication : ");
			System.out.println("Enter 4 for division : ");
			System.out.println("Enter 5  for exit : ");
			System.out.println("=====================================");
			option = sc.nextInt();

			SimpleCalculator scal = new SimpleCalculator();

			 if(option >=1 && option <= 4) {

				 System.out.print("Enter the Number 1 :\t ");
				 int num1 = sc.nextInt();
				 System.out.print("Enter the Number 2 :\t ");
				 int num2 = sc.nextInt();
				 System.out.println("=====================================");
			switch (option) {

			case 1: 
				System.out.println("Additon is : " + scal.add(num1, num2));
				break;

			case 2:  
				System.out.println("Subtraction is : " +  scal.sub(num1, num2));
				break;

			case 3:  
				System.out.println("Multiplication is : " + scal.mul(num1, num2));
				break;
				
			case 4:  
				try {
					System.out.println("Division is : " + scal.div(num1, num2));
				} catch (ArithmeticException e) {
					System.out.println("Division is 0.0");
					System.out.println("Don't Enter second Number as 0 ");
					break;
					
				}			
				break;		 
				}
			 }
			 else if(option != 5) {
				 System.out.println("Invalid Option");
			 }

		}while(option!=5);
		System.out.println("!..Thanks For useing our application..!");
		sc.close();
}

}
