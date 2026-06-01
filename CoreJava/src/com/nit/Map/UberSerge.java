package com.nit.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class UberSerge {
	public static void main(String[] args) {
		Map<String, Double> location = new LinkedHashMap<String, Double>();
		location.put("Gachibowli",200.0);
		location.put("Eragadda",100.0);
		location.put("BegamPeth",300.0);
		
		System.out.println("Price Chart of taxi fare as per location in normal time");
		
		for(Map.Entry<String, Double> e : location.entrySet()) {
			System.out.println(e.getKey() + " : Rs " + e.getValue());
		}
		
		
		
		System.out.println("\n\nprice chart in the Rain Season");
		for(Map.Entry<String, Double> e : location.entrySet()) {
			 
			System.out.println(e.getKey() + " : Rs " + e.getValue() * 1.5);
		}
		
		System.out.println("\n\nRain Start");
		System.out.println("Price Surge 1.5X times due to rain : ");
		//location.replaceAll((loc, price)-> price * 1.5);
		
		location.forEach((l,a)-> System.out.println(l + " : Rs " + a * 1.5));
		
		//System.out.println(location);
		
		
	}

}
