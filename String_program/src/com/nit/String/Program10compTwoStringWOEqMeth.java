package com.nit.String;

public class Program10compTwoStringWOEqMeth {

	public static void main(String[] args) {
		
		String str = " hello my name is vivek";
		String str2 = " hello my name is vivek";
		
		boolean checkString = true;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != str2.charAt(i)) {
				checkString = false;
				break;
			}
			
		}
		
		if(checkString) {
			System.out.println("Both String are Same");
		}else {
			System.out.println("Both String are not Same");
			
		}
		
 
		 
		
	}

}
