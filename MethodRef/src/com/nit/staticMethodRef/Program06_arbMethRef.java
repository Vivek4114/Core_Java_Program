package com.nit.staticMethodRef;

interface arbitary<T,U,V,R>{
	R myfunction(T t, U u, V v);
}

class Additon{
	
	public Integer doSum(String x, String y) {
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
}

public class Program06_arbMethRef {

	public static void main(String[] args) {
		
		arbitary<Additon,String, String, Integer> ar = ((addition, s1, s2) ->  addition.doSum(s1, s2));
		
		System.out.println(ar.myfunction(new Additon(), "100", "200"));
		
		
		arbitary<Additon,String, String, Integer> br =  Additon::doSum;
		System.out.println(br.myfunction(new Additon(), "100", "200"));
		
		
		
	}
}
