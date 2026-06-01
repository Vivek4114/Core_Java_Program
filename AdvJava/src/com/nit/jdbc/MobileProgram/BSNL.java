package com.nit.jdbc.MobileProgram;

public class BSNL implements Sim{
	private double balance;
	@Override
	public void recharge(double amt) {
		 System.out.println("Airtel Sim ExesTing Balance is : "+ balance );
		
	}

	@Override
	public void currentBalance() {
		 
		 System.out.println("BSNL Sim ExesTing Balance is : "+ balance );
	}

	@Override
	public String call(long mobNum) {
		return "BSNL : " + mobNum  + " : the number your are dialing is currently busy please dial after some time";
		
	}

	@Override
	public String sms(long mobNum, String msg) {
		 
		return "BSNL : "+ msg + " Send Successfully on " + mobNum+ " ";
	}
	

}
