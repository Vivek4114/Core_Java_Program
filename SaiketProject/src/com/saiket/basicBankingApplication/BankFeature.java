package com.saiket.basicBankingApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankFeature {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int ch = 0;
		do {
			System.out.println("Enter 1 for the Create Account : ");
			System.out.println("Enter 2 for the Remove Account based on the AccNo: ");
			System.out.println("Enter 3 for the Show All Account : ");
			System.out.println("Enter 4  for the Exit from the Bank App : ");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (InputMismatchException e) {
				System.out.println("Enter only Integer Number..!");
			}

			switch (ch) {
			case 1: {
				System.out.println("Enter the Bank Type [SAVING/CURRENT]");
				String type = sc.nextLine();
				String upperType = type.toUpperCase();

				switch (upperType) {
				case "SAVING": {
					int ano = 0;
					String acName = "";
					double amt = 0.0d;
					try {
						System.out.println("Enter the Account Number");
						ano = Integer.parseInt(sc.nextLine());
						System.out.println("Enter  for the acc holder name : ");
						acName = sc.nextLine();
						System.out.println("first amount to be Add ");
						amt = Double.parseDouble(sc.nextLine());

					} catch (InputMismatchException e) {
						System.out.println("Enter the Correct keys");
					}
					SavingAccount sa = new SavingAccount(ano, acName, amt);
					bank.addAccount(sa);
					//bank.accounts.put(ano, sa);

					int choice2 = 0;
					do {
						System.out.println("Enter 1 for Amount Deposite");
						System.out.println("Enter 2 For the Withdraw Amount");
						System.out.println("Enter 3 For view All Transaction : ");
						System.out.println("Enter 4 for the Exit..");
						System.out.println("Enter the Choice : ");
						try {
							choice2 = Integer.parseInt(sc.nextLine());
						} catch (InputMismatchException e) {
							System.out.println("Enter the correct Number only");
						}

						switch (choice2) {
						case 1 -> {
							System.out.println("Enter the amount to be Added : ");
							double amount = 0;
							try {
								amount = Integer.parseInt(sc.nextLine());
							} catch (InputMismatchException e) {
								System.out.println("Enter the Number only");
							}
							sa.deposite(amount);
							int id = (int) (Math.random() * 100000);
							Transaction t = new Transaction(id, amount, "Deposite");
							sa.addTransaction(t);

						}
						case 2 -> {
							System.out.println("Enter the Amount to be Withdraw : ");

							double amount = 0;
							try {
								amount = Integer.parseInt(sc.nextLine());
							} catch (InputMismatchException e) {
								System.out.println("Enter the Number only");
							}
							sa.withdraw(amount);
							int id = (int) (Math.random() * 100000);
							Transaction t = new Transaction(id, amount, "withdraw");
							sa.addTransaction(t);
						}
						case 3 -> {
							sa.viewTransactionHistory();
						}
						case 4 -> {
							System.out.println("Operation will be Over..!");
							break;
						}

						default -> {
							System.out.println("your Enter the Wrong choice please Enter some valid choice");
						}
						}

					} while (choice2 != 4);

				}

					break;
				case "CURRENT": {

					int ano = 0;
					String acName = "";
					double amt = 0.0d;
					try {
						System.out.println("Enter the Account Number");
						ano = Integer.parseInt(sc.nextLine());
						System.out.println("Enter  for the acc holder name : ");
						acName = sc.nextLine();
						System.out.println("first amount to be Add ");
						amt = Double.parseDouble(sc.nextLine());
					} catch (InputMismatchException e) {
						System.out.println("Enter only the number and appropriate values");
					}
					CurrentAccount ca = new CurrentAccount(ano, acName, amt);
					bank.addAccount(ca);
					//bank.accounts.put(ano, ca);

					int choice3 = 0;
					do {
						System.out.println("Enter 1 for Amount Deposite");
						System.out.println("Enter 2 For the Withdraw Amount");
						System.out.println("Enter 3 for the view Transaction History : ");
						System.out.println("Enter 4 for the exit from operation");
						System.out.println("Enter the Choice : ");
						try {
							choice3 = Integer.parseInt(sc.nextLine());
						} catch (InputMismatchException e) {
							System.out.println("Enter only Number");
						}

						switch (choice3) {
						case 1 -> {
							System.out.println("Enter the amount to be Added : ");
							double amount = 0;
							try {
								amount = Integer.parseInt(sc.nextLine());
							} catch (InputMismatchException e) {
								System.out.println("Enter the Number only");
							}
							ca.deposite(amount);
							int id = (int) (Math.random() * 100000);						Transaction t = new Transaction(id, amt, "Deposite");
							ca.addTransaction(t);

						}
						case 2 -> {
							System.out.println("Enter the Amount to be Withdraw : ");
							double amount = 0;
							try {
								amount = Integer.parseInt(sc.nextLine());
							} catch (InputMismatchException e) {
								System.out.println("Enter the Number only");
							}
							ca.withdraw(amount);
							int id = (int) (Math.random() * 100000);
							Transaction t = new Transaction(id, amt, "withdraw");
							ca.addTransaction(t);

						}

						case 3 -> {
							ca.viewTransactionHistory();
						}
						case 4 -> {
							System.out.println("Operation Perform successfully..!");
							break;
						}
						default -> {
							System.out.println("your Enter the Wrong choice please Enter some valid choice");
						}

						}

					} while (choice3 != 4);

				}
				}
			}
				break;
			case 2: {
				System.out.println("Enter the Account No : ");
				int accNo = Integer.parseInt(sc.nextLine());
				bank.removeAccount(accNo);

			}
				break;
			case 3: {
				System.out.println("=======total Account is ===========");
				bank.shwoAllAccount();
			}
				break;

			case 4: {
				System.out.println("Thank you For the Visit out Application..!");
				System.exit(0);

			}
				break;
			default: {
				System.out.println("You enter the Wrong choice");
			}

			}
		} while (ch != 4);

		sc.close();
	}

}
