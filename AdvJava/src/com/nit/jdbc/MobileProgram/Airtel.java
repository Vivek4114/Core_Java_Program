package com.nit.jdbc.MobileProgram;

public class Airtel implements Sim{
	private double balance;
	@Override
	public void recharge(double amt) {
		this.balance += amt;
		System.out.println("Airtel : " + amt +" Richarge Successfully");
		
	}
	@Override
	public void currentBalance() {
		 System.out.println("Airtel Sim ExesTing Balance is : "+ balance );
		
	}

	@Override
	public String call(long mobNum) {
		return "Airtel : " + mobNum  + " : the number your are dialing is currently busy please dial after some time";
	}

	@Override
	public String sms(long mobNum, String msg){	 
		return "Airtel : "+ msg + " Send Successfully on " + mobNum+ " ";
	}

}
