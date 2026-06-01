package com.saiket.basicBankingApplication;

public class Transaction {

	private int transactionId;
	private double transactionAmt;
	private String tansactionType;;
 
	public Transaction(int transactionId, double transactionAmt, String tansactionType) {
		super();
		this.transactionId = transactionId;
		this.transactionAmt = transactionAmt;
		this.tansactionType = tansactionType;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getTransactionAmt() {
		return transactionAmt;
	}

	public void setTransactionAmt(double transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public String getTansactionType() {
		return tansactionType;
	}

	public void setTansactionType(String tansactionType) {
		this.tansactionType = tansactionType;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + ", transactionAmt=" + transactionAmt
				+ ", tansactionType =" + tansactionType + "]";
	}

}
