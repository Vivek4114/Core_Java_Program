package com.nit.methodReference;


@FunctionalInterface
interface PaymentProcessor{
	void process(PaymentGateway pg, double amount);
}

interface PaymentGateway{
	void makePayment(double amount);
	
}

class CreaditCard implements PaymentGateway{
	double balance;
	String cardHolderName;
	public CreaditCard(double balance, String cardHolderName) {
 
		this.balance = balance;
		this.cardHolderName = cardHolderName;
	} 
	
	public void display() {
		System.out.println(this.toString() );
	}
	
	
	@Override
	public void makePayment(double amount) {
		 if(balance >= amount) {
			 balance -= amount;
			 System.out.println("Payment SuccessFully. Balance is " + balance);
		 }
		 else {
			 System.out.println("Insufficient Balance.");
		 }
		
	}
	@Override
	public String toString() {
		return "CreaditCard [balance=" + balance + ", cardHolderName=" + cardHolderName + "]";
	}
	
 }

class DebitCard implements PaymentGateway{
	double balance ;
	String cardHolderNae;
	public DebitCard(double balance, String cardHolderNae) {
	 
		this.balance = balance;
		this.cardHolderNae = cardHolderNae;
	}
	
	public void display( ) {
		 System.out.println(this.toString());
	}
	
	@Override
	public void makePayment(double amount) {
		 if(balance >= amount) {
			 balance -= amount;
			 System.out.println("Payment SuccessFully. Balance is " + balance);
		 }
		 else {
			 System.out.println("Insufficient Balance.");
		 }
		
	}
	@Override
	public String toString() {
		return "DebitCard [balance=" + balance + ", cardHolderNae=" + cardHolderNae + "]";
	}
}
 

public class PaymentGatewayApplication {
	public static void main(String[] args) {
		PaymentGateway creditCard = new CreaditCard( 2000, "Amar");
		PaymentGateway debitCard = new DebitCard(3000,"Chandrakant");
		
		
		 
		PaymentProcessor pp = PaymentGateway::makePayment;
		pp.process(creditCard, 1000);
		PaymentProcessor p2 = PaymentGateway::makePayment;
		p2.process(debitCard, 500);
	}

}
