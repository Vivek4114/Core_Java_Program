package com.nit.jdbc.MobileProgram;

public class Mobile {
	private Sim sim;
	public void insertSim(String simName) throws Exception {
		try {
			Class cls = Class.forName(simName);
			Object obj = cls.newInstance();
			
			if(obj instanceof Sim) {
				this.sim = (Sim) obj;
			}
			else {
				throw new Exception(sim + " is not a sim");
			}
			
			
		}
		catch( ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			
		}
	}
	
	public void richarge(double amt) {
		sim.recharge(amt);
	}
	
	public void currentBalance() {
		sim.currentBalance();
	}
	
	public String call(long mn) {
		return sim.call(mn);
	}
	
	public String sms(long mn, String msg) {
		return sim.sms(mn, msg);
	}

}
