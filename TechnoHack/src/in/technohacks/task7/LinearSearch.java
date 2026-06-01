package in.technohacks.task7;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 2,4,5,2, 6};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the target Element : ");
		int targetEle = sc.nextInt();
		int index = 0;
		boolean isFound = false;
		for(int i = 0; i<arr.length; i++) {
			if(targetEle == arr[i]) {
				index  = i;
				isFound = true;
			}
		}
		if(isFound) 
			System.out.println(targetEle + " is Found At " + index + " index ");
		else		
			System.out.println(targetEle + " is not Found ");
}

}
