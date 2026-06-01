package in.technohacks.task4;

import java.util.Scanner;

public class PalindromeChecker {
	public static void checkPalindrome(int number) {
		int temp = number;
		
		int rev= 0;
		while(temp!=0) {
			int rem = temp%10;
			rev = rev*10 + rem;
			temp/=10;
		}
		if(number == rev)
			System.out.println(number + " is palindrome.");
		else 
			System.out.println(number + " is not a palindrome.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		checkPalindrome(num);
		sc.close();
	}
}
