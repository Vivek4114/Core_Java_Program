package com.nit.Dec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(Arrays.asList(292, 24, 64, 95, 45, 66, 19));
		System.out.println(intList);

		/*
		 * for (int i = intList.size() - 1; i >= 0; i--) { 
		 * revList.add(intList.get(i));
		 * }
		 */
		int temp = 0;
		for (int i = 0; i <= intList.size() / 2; i++) {
			temp = intList.get(i);
			intList.set(i, intList.get(intList.size() - 1 - i));
			intList.set(intList.size() - 1 - i, temp);
		}
 
	}
}
