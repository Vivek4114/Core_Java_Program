package com.nit.Dec5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CountOccurance {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Apple");
		strList.add("Pinaple");
		strList.add("Grapes");
		strList.add("Apple");
		strList.add("Coconut");
		strList.add("Mango");
		strList.add("Grapes");
		
		String target="Apple";
		int count = 0;
		for(int i = 0 ; i<strList.size(); i++) {
			if(target.equals(strList.get(i))) count++;
		}
			if(count>1) System.out.println(target+" count is: "+count);
	}

}
