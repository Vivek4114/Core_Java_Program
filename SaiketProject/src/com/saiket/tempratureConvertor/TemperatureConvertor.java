package com.saiket.tempratureConvertor;

import java.lang.reflect.Executable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConvertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("========================================================================");
			System.out.println("Hellow Dear User This is application\nis develope for the Temperature Convertor..!");
			System.out.println("========================================================================");
			System.out.println("Enter 1 for the Convert the  Degree Celcius to ferenheit");
			System.out.println("Enter 2 For the Convert the Degree Celcius to Kelvin");
			System.out.println("Enter 3 for the Convert the ferenheiht to celcius");
			System.out.println("Enter 4 for the Convert the ferenheiht to kelvin");
			System.out.println("Enter 5 for the Convert the kelvin Kelvin to Degree");
			System.out.println("Enter 6 for the convert the kelvin to ferenheit");
			System.out.println("Enter 7 For Exit : ");
			System.out.print("Enter The Input here : \t");

			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please Enter Some Integer Value");
				return;
			}
			System.out.println("========================================================================");

			System.out.print("Enter the Temperature for \n");
			double temp = 0;
			switch (choice) {
			case 1:
				System.out.print("Degree --> Ferenheight Conversion : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
					return;
				}
				System.out.println("Result is : " + calculateTemperatureToFerenheight(temp));
				break;

			case 2:
				System.out.print("Degree --> kelvin Conversion : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
					return;
				}
				System.out.println("Result is : " + calculateTemperaturetoCelcius(temp));
				break;

			case 3:
				System.out.print("Ferenheit --> Degree Conversion : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
					return;
				}
				System.out.println("Result is : " + calTempToFtoDeg(temp));
				break;

			case 4:
				System.out.print("Ferenheit --> Kelvin Conversion  : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
				}
				System.out.println("Result is : " + calTempToFtoKel(temp));
				break;

			case 5:
				System.out.print("Kelvin --> Degree Conversion  : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
					return;
				}
				System.out.println("Result is : " + calTempToKtoDeg(temp));
				break;

			case 6:
				System.out.print("Kelvin --> Ferenheit Conversion : \t");
				try {
					temp = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Enter some Valid Number  ");
					return;
				}
				System.out.println("Result is : " + calTempToKtoFer(temp));
				break;

			default:
				System.out.println("invalid Choice Conversion");

			}
		} while (choice != 7);
		System.out.println("Thank You For the Visiting our application");
		sc.close();

	}

	private static double calculateTemperatureToFerenheight(double temperature) {
		if (temperature <= 0) {
			return 0;
		}

		return (temperature * 9 / 5) + 32;
	}

	private static double calculateTemperaturetoCelcius(double temperature) {
		if (temperature <= 0) {
			return 0;
		}
		return (temperature - 32) * 5 / 9;
	}

	private static double calTempToFtoDeg(double temp) {
		if (temp <= 0) {
			return 0;
		}
		return (temp * 9.5) + 32;
	}

	private static double calTempToFtoKel(double temp) {
		if (temp <= 0) {
			return 0;
		}
		return (temp - 32) * 5 / 9 + 273.15;
	}

	private static double calTempToKtoFer(double temp) {
		if (temp <= 0) {
			return 0;
		}
		return (temp - 273.15) * 9 / 5 + 32;
	}

	private static double calTempToKtoDeg(double temp) {
		if (temp <= 0) {
			return 0;
		}
		return temp - 273.15;
	}

}
