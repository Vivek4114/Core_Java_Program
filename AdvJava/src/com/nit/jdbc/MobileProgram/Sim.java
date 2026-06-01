package com.nit.jdbc.MobileProgram;

public interface Sim {
	public void recharge(double amt);
	public void currentBalance();
	public String call(long mobNum);
	public String sms(long mobNum, String msg);
	 

}
