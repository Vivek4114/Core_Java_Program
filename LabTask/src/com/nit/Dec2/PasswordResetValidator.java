package com.nit.Dec2;

import java.util.Scanner;

public class PasswordResetValidator {

	public String removeKey(String oldPassword, String unlockKey) {
		
		if(oldPassword.contains(unlockKey)) {
			String newPass = oldPassword.replace(unlockKey, "");
			return newPass;
			
		}
		else {
			return oldPassword;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PasswordResetValidator prv = new PasswordResetValidator();
		System.out.println("Enter the Old Password");
		String pass = sc.next();
		
		System.out.println("Enter the Unclock key");
		String unclockey = sc.next();
		
		System.out.println(" PassWord is : " +prv.removeKey(pass, unclockey));
		
		
		
		
	}
}
