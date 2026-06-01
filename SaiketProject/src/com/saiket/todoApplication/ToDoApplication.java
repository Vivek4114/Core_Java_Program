package com.saiket.todoApplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ToDoApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DailyTask dt = new DailyTask();

		int choice = 0;
		
		try(sc){
			
			do {
				System.out.println("Enter 1 For add the task : ");
				System.out.println("Enter 2 For View All Task : ");
				System.out.println("Enter 3 For view status : ");
				System.out.println("Enter 4 for Exit : ");
				System.out.print("Enter Here :--->");
				choice = Integer.parseInt(sc.nextLine());
				
				switch (choice) {
				case 1: {
					System.out.println("Enter the Task here");
					String tasks = sc.nextLine();
					dt.addTask(tasks);
					
				}
				break;
				case 2: {
					dt.viewTask();
				}
				break;
				case 3: {
					System.out.println("Enter the Task : ");
					String task = sc.nextLine();
					System.out.println("Enter the Status of the Task (true/false ) : ");
					boolean status = sc.nextBoolean();
					dt.viewStatus(status, task);
					
				}
				break;
				case 4: {
					System.out.println("Thank you for useing this application ");
					System.exit(0);
					
				}
				break;
				
				default:
					System.out.println("You Select some Wrong choice Please enter some correct choice  ");
				}
			} while (choice != 4);
		}catch( InputMismatchException | NumberFormatException  e){
			System.out.println("Enter Some Valid Details");
			
		}


	}

}

class DailyTask {
	List<String> tsk = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	public void addTask(String task) {
		tsk.add(task);
		System.out.println("Task is added Successfully");
	}

	public void viewTask() {

		tsk.forEach(System.out::println);
	}

	public void viewStatus(boolean status, String task) {

		if (tsk.contains(task) && status == true) {
			System.out.println("Task is is alived");
		} else {
			System.out.println("Task is  not alived.!");
		}

	}

}