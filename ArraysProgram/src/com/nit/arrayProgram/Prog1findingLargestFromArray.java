package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.OptionalInt;

public class  Prog1findingLargestFromArray{
	public static void main(String[] args) {
		
		int arr[] = {109,29,399,12,22};
		int max = arr[0];
		
		for(int i = 1;  i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
    findMax(arr);		
		
	}
	public static  void findMax(int arr[]) {
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max.getAsInt());
		
	}

}



