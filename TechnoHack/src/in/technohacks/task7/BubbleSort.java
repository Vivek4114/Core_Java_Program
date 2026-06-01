package in.technohacks.task7;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the Element For index  " + i + " : \t");
			arr[i]  = sc.nextInt();
		}
		
		System.out.println("=================================================");
		System.out.println("Element Printing before the Bubble Sorting ");
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n=================================================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Element Printing After the Bubble Sort ");
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n=================================================");

	}
}
