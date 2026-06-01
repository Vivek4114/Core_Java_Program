package com.saiket.basicBankingApplication;

public class CurrentAccount extends Account {
	
	//Bank bank;

	public CurrentAccount(int accNo, String accHolder, double balance) {
		super(accNo, accHolder, balance);
	}

	@Override
	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Current account " + amount + " is added Successfully..!");
			 System.out.println("Available Amount is : " + balance);
		} else {
			System.out.println("the deposite opr is not perform because zero or less than zero amount is not deposite ");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			System.out.println("Current account " + amount + " is withdraw Successfully..!");
			 System.out.println("Available Amount is : " + balance);
		} else {
			System.out.println("zero amount is not withdraw..");
		}

	}

}
