package com.nit.task;

public class FirstNonRepeatbleChar {
	
	public static void main(String[] args) {
		
		String letter = "abdac";

		String[] letSplit = letter.split("");

		for (int i = 0; i < letSplit.length; i++) {
			int c = 0, v = 0;
			for (int j = 0; j < letSplit.length; j++) {

				if (letSplit[i].equals(letSplit[j]) && i >= j)
					c++;
				if (letSplit[i].equals(letSplit[j]) && i < j)
					v++;

			}

			if (c == 1 && v == 0) {
				System.out.print(letSplit[i]);
				break;

			}
		}
	}

}
