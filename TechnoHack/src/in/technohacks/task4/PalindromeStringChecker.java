package in.technohacks.task4;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeStringChecker {
	static void checkPalindrome(String str) {
		String letter[] = str.split("");
		String exp = "";
		for (int i = letter.length - 1; i >= 0; i--) {
			exp += letter[i];
		}

		if (str.equals(exp))
			System.out.println(str + " is palindrome ");
		else
			System.out.println(str + " is not a palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : \t ");
		String str = sc.next();
		checkPalindrome(str);
		sc.close();
	}

}
