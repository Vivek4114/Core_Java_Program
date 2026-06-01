package com.nit.Map;

import java.util.HashMap;
import java.util.Map;

public class BankTransaction {
	public static void main(String[] args) {
		Map<String, String> responce =  new HashMap<String, String>();
		responce.put("TXN_001","Insufficient Funds");
		responce.put("TXN_002","Incorrect Credentital");
		responce.put("INV_TXN","Invalid Transaction");
		
		String serverRes = "TXN_001";
		System.out.println("User Performed Some Transaction, and the transaction " +
				"\n is Failed then, got a server responce : " + serverRes);
		
		System.out.println("Reason for transaction failure : "+ 
					responce.getOrDefault(serverRes, "Invalid Transaction"));
		
	 
		
	}
}
