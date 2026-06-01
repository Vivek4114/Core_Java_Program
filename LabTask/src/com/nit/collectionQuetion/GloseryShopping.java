package com.nit.collectionQuetion;

import java.util.ArrayList;
import java.util.Scanner;

public class GloseryShopping {
	ArrayList<String> alist = new ArrayList<String>();

	public void addItem(String item) {
		System.out.println(alist.add(item));
	}

	public int getItemCount() {
		return alist.size();
	}

	public void removeItem(String item) {
		System.out.println(alist.remove(item));
	}

	public void replaceItem(int index, String item) {

		if (index > 0 && alist.size() >= index) {
			System.out.println(alist.set(index, item));
		} else {
			System.out.println("Error: Cannot replace at invalid index ");
		}

	}

	public void displayList() {

		System.out.println(alist);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GloseryShopping gs = new GloseryShopping();

		xyz:
			while (true) {
			System.out.println("Enter 1 for AddItem");
			System.out.println("Enter 2 for remove item");
			System.out.println("Enter 3 for Replace item");
			System.out.println("Enter 4 for the Check the list ");
			System.out.println("Enter 5 for checking size of list : ");
			System.out.println("Enter 6 for the exit\n");
			System.out.println("Please Enter Some Number : ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the Item add");
				String items = sc.next();
				gs.addItem(items);
				System.out.println(items + " to Be added in the List ..!\n ");
				break;

			case 2:
				System.out.println("Enter the Item to be remove");
				String itm = sc.next();
				gs.removeItem(itm);
				System.out.println(itm + " to be Removed from the List \n");
			 
				break;

			case 3:
				System.out.println("Enter the Index no : ");
				int index = sc.nextInt();

				System.out.println("Enter the Item1 Name : ");
				String item1 = sc.next();
				gs.replaceItem(index, item1);
				System.out.println(item1 + " is replace on this " + index  + " \n" );
				break;

			case 4:
				System.out.println("Value in the List is : ");
				gs.displayList();
				System.out.println();
			 
				break;

			case 5:
				System.out.println("Count of arraylist is : " + gs.getItemCount());
				break;

			case 6:
				System.out.println("Your System is Exited ..!");
				break xyz;

			default:

				System.out.println("Wrong Input please Enterr Some ");

			}
		}
		
		sc.close();

	}

}
