package com.nit.methodReference;
//import java.util.function.*;
import java.util.Scanner;
 
@FunctionalInterface
interface ValidatePin{
	public int checkPin(String pin) ;
		 
}

class PINValidation {
	public static int validatePin(String pin) {
		if(pin.length() >= 4) {
			return  pin.length();
		}else {
			return 0;
		}
	}
}

public class ATMPinValidator {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Pin In the Number : ");
		 String pin  = sc.next();
		 ValidatePin v =  PINValidation::validatePin;
		 if(v.checkPin(pin) == 0) {
			 System.out.println("Pin is Not Valid..!");
		 }else {
			 System.out.println(" Pin is : "+ pin);
			 System.out.println("Pin is Valid Pin containing More than 4 Digit");
			 
		 }
	}

}
