package com.nit.methodReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.Scanner;

class SendMSG{
	public void sendSMS(long mob) {
		System.out.println(" Message Send on : " + mob);
	}
}


public class SMSSender {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Mobile Number : ");
		 long mob = sc.nextLong();
		 SendMSG s = new SendMSG(); 
		Consumer<Long> con = s::sendSMS ;
		con.accept(mob);
		sc.close();
		 
		 
		
	}
}
