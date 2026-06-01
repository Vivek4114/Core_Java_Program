package in.technohacks.task3;

import java.util.Scanner;

public class FactorialNumber {
	public double calculateFactorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * calculateFactorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		FactorialNumber fn = new FactorialNumber();
		System.out.println("Factorial is : " + fn.calculateFactorial(n));
		sc.close();
	}
}
