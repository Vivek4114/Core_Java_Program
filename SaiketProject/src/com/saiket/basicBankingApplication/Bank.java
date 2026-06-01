package com.saiket.basicBankingApplication;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<Integer, Account> accounts = new HashMap<Integer, Account>();
	int accNo;

	public void addAccount(Account acc) {
		 		
		accounts.put(acc.getAccountNumber(), acc);
		System.out.println("Account is Added Successfully..!");
	 
	}

	public void removeAccount( int accNo) {

			if(accounts.containsKey(accNo)) {
				accounts.remove(accNo);
				System.out.println("Account is remove Successfully..!");
			}else {
				System.out.println("Account is not found.!");
			}
		  
	}
	
	public void shwoAllAccount() {
		
		if(accounts.isEmpty()) {
			System.out.println("no Account is is the bank");
			return;
		}
		
		
//		for(Account acc: accounts.values()) {
//			System.out.println(acc.getAccountHolder() + "\t" + 
//							acc.getAccountNumber() + " \t" + 
//							acc.getBalance());
//		}
		accounts.forEach((x,y)->System.out.println(x+" :"+y));
	}
}
