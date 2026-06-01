package com.nit.jdbc.MobileProgram;
import java.util.Scanner;

public class MobileScreen {
	public static void main(String[] args) {
		Mobile iphone = new Mobile();
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Insert Sim");
			iphone.insertSim(sc.next());
			System.out.println("Sim is SuccessFully Activated.");
			loop : while(true) {
				System.out.println("\n Choose One option : ");
				System.out.println("Type 1 to recharge : ");
				System.out.println("Type 2 to current Balance : ");
				System.out.println("Type 3 to make Call : ");
				System.out.println("Type 4  to send sms ");
				System.out.println("Type 5 to exit");
				System.out.println(" \n Enter Option : ");
				
				int option = sc.nextInt();
				sc.nextLine();
				switch(option){
				case 1 : 
					System.out.println("Enter amount to Richarge : ");
					iphone.richarge(sc.nextDouble());
					sc.nextLine();
					 
					break;
					
				case 2 : 
					iphone.currentBalance();
					break;
				
				case 3 : 
					System.out.println("Enter mobile Number : ");
					String responce = iphone.call(sc.nextLong());
					sc.nextLine();
					System.out.println(responce);
					break;
					
				case 4 : 
					System.out.println("Enter mobile Number : ");
					long mn = sc.nextLong();
					sc.nextLine();
					System.out.println("type Message ");
					String msg = sc.nextLine();
					String res = iphone.sms(mn, msg);
					System.out.println(res);
					break;
					
				case 5: System.out.println("Thank You Tata Bye Bye");
				break loop;
				
				default : System.out.println("Choose Valid option ");
					
				}
			}
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}

 	}


