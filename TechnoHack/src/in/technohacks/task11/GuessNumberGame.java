package in.technohacks.task11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char result = ' ';

		do {
			Random random = new Random();
			int guess = random.nextInt(100) + 1;

			System.out.print(YELLOW + "Enter the Number (1 - 100) :\t ");
			int num = 0;
			try {
				num = sc.nextInt();

				if (num == guess) {
					System.out.println(GREEN + " " + num + " Guess  is Correct..");
				} else {
					System.out.println(RED + "Your Guess Number is : " + num + " System Generated Number is : " + guess);
				}
			} catch (InputMismatchException e) {
				System.out.println(RED + "Enter the Valid Integer Number ");

			}

			System.out.print(GREEN + "\n Do you want to Guess Again [ Y \\ N ] : \t ");
			sc.nextLine();
			result = sc.next().charAt(0);
		} while (result == 'Y' || result == 'y');

		System.out.println(RED + "Your Enter Wrong Output");
		sc.close();
	}
}
