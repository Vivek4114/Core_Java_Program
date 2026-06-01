package com.saiket.basicBankingApplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	int accountNumber;
	String accountHolder;
	double balance;
	List<Transaction>  transa;
	
	
	 
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ ", transa=" + transa + "]";
	}
	public Account(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
		this.transa = new ArrayList<Transaction>();
	}
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setTransa(List<Transaction> transa) {
		this.transa = transa;
	}
	
	public void addTransaction(Transaction transaction) {
		this.transa.add(transaction);
	}
	
	public void viewTransactionHistory() {
		if(transa.isEmpty()) {
			System.out.println("No Transaction yet");
		}else {
			System.out.println("Total transaction History.");
			for(Transaction t : transa) {
				System.out.println(t);
			}
		}
	}
	
	
	
	
	
	
	 
}
