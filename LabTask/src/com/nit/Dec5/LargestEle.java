package com.nit.Dec5;

import java.util.ArrayList;
import java.util.List;

public class LargestEle {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(29);
		numList.add(97);
		numList.add(03);
		numList.add(42);
		numList.add(19);
		numList.add(85);
		
		System.out.println(numList);
		
		int max = numList.get(0);
		for(int i = 1; i< numList.size(); i++) {
				if(  max < numList.get(i)){
					  max = numList.get(i);
				}
			}
		
		
		System.out.println("Largest Element in List : " + max);
		
		
		
	}

}
