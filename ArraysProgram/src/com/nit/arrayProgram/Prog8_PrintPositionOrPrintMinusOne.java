package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Prog8_PrintPositionOrPrintMinusOne {
	
	public static void PrintPositionOrPrintMinusOne(int[] arr, int num) {
		System.out.println("=====useing Stream Api============");
		OptionalInt first = IntStream.range(0, arr.length).filter(i -> arr[i] == num).findFirst();

		if(first.isPresent()) {
			System.out.println(num + " is Present at "+ first.getAsInt());
		}else {
			System.out.println("Element is not present ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 10, 39, 10, 0, 0, 29, 17,-8,29};
		int num = 29;
		int index = -1;
		
		PrintPositionOrPrintMinusOne(arr,num);
		System.out.println("=====useing simple Api============");
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==num) {
				 index = i;
				 break;
			}
		}
		
		if(index != -1) {
			System.out.println(num + " is present at " + index);
		}else {
			System.out.println("num is not present");
		}
	}

}
