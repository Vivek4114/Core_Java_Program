package in.technohacks.task2;

import java.util.Scanner;

public class FibonacchiSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range of fibonacchi Series : \t ");
		int range = sc.nextInt();
		int val1 = 0;
		int val2 = 1;
		System.out.print(val1 + " ");
		for(int i = 0; i<range-1; i++) {
			int val3 = val1 + val2;
			System.out.print(val3 + " ");
			 val1 = val2; 
			 val2 = val3;
		}
		
		sc.close();
		
	}
}
