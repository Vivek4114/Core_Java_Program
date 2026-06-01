package com.nit.collectionQuetion;

import java.util.ArrayList;

public class StudentGradeManagement {

	public static void main(String[] args) {

		GradeManager gm = new GradeManager();

		gm.addGrade(29);
		gm.addGrade(40);
		gm.addGrade(30);
		gm.addGrade(59);

		gm.removeFailingGrades();

		System.out.println("Average is :  " + gm.calculateAverage());

		System.out.println(" Higest is : " + gm.getHighestGrade());

		gm.displayGrades();

	}

}

class GradeManager {

	ArrayList<Integer> alist = new ArrayList<Integer>();

	public void addGrade(int grade) {

		if (grade > 0 && grade <= 100) {
			alist.add(grade);
			System.out.println(grade + "  is Added in the list ..!");
		} else {
			System.out.println("You Must write some valid Grade");
		}

	}

	public double calculateAverage() {
		double total = 0;
		int totalMarks = alist.size() * 100;

		for (int i = 0; i < alist.size(); i++) {
			total = total + alist.get(i);
		}

		double avg = (total / totalMarks) * 100.0;
		return avg;

	}

	public int getHighestGrade() {
		try {
			int higest = 0;

			for (int i = 1; i < alist.size(); i++) {

				if (alist.get(higest) < alist.get(i)) {

					higest = i;
				}
			}

			return alist.get(higest);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Highest Grade: None");
			return 0;
		}

	}

	public void removeFailingGrades() {

		for (int i = alist.size() - 1; i >= 0; i--) {
			if (alist.get(i) < 60) {
				System.out.println(alist.get(i) + " Element is Removed ..! ");
				alist.remove(i);
			}
		}

	}

	public void displayGrades() {
		System.out.println("Element is :  " + alist + " \n ");
	}

}
