package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Test05_SelectQuery {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		Boolean isExit = true;
		loop: while (isExit) {
			String placeholder = null;
			String course[] = null;
			System.out.println("Enter Your Choice : ");

			System.out.println("Enter 1 Display All Query");
			System.out.println("Enter 2  for Display Specific Course Details : ");
			System.out.println("Enter 3 For Exit : ");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1 || choice == 2 || choice == 3) {

				if (choice == 2) {

					System.out.println("Enter Course Name Using '|' separator");
					String str = sc.nextLine();

					course = str.split("\\|");

					placeholder = String.join(",", Arrays.stream(course).map(s -> "?").toList());

					System.out.println(placeholder);
				}

				System.out.println(Arrays.toString(course));

				try (Connection conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek",
						"vivek");
						PreparedStatement pstmt1 = conn.prepareStatement("""
								SELECT s.*, c.course_name
								from student01 s, course01 c
								where s.course_id = c.course_id

								""");

						PreparedStatement pstmt2 = conn.prepareStatement(

								"	SELECT s.*, c.course_name " + " from student01 s, course01 c "
										+ "	where s.course_id = c.course_id  " + "and c.course_name IN (" + placeholder
										+ ")"

						);

				) {
					ResultSet rs = null;

					switch (choice) {

					case 1: {
						rs = pstmt1.executeQuery();
						ResultSetMetaData rsmd = rs.getMetaData();
						int count = rsmd.getColumnCount();
						String columnName = null;
						int maxGap;

						for (int i = 1; i <= count; i++) {
							columnName = rsmd.getColumnName(i);
							maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

							System.out.printf("%" + maxGap + "s ", columnName);

						}
						
						for (int i = 1; i <= count; i++) {
							columnName = rsmd.getColumnName(i);
							maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

							for (int j = 1; j <= maxGap; j++) {
								 
								System.out.printf("%" + maxGap + "s ", "-");

							}

						}
						rs.next();
						do {

							for (int i = 1; i <= count; i++) {
								columnName = rsmd.getColumnName(i);
								maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

								if (columnName.contains("NAME")) {
									System.out.printf("%-" + maxGap + "s ", rs.getString(i));
								} else {

									System.out.printf("%" + maxGap + "s ", rs.getString(i));
								}
							}
							System.out.println();

						} while (rs.next());

					}
						break;
					case 2: {
						int count1 = 1;
						for (String s : course) {

							pstmt2.setString(count1++, s.trim());
						}
						rs = pstmt2.executeQuery();
						ResultSetMetaData rsmd = rs.getMetaData();
						int count = rsmd.getColumnCount();
						
						String columnName = null;
						int maxGap;

						for (int i = 1; i <= count; i++) {
							columnName = rsmd.getColumnName(i);
							maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

							System.out.printf("%" + maxGap + "s ", columnName);

						}

						for (int i = 1; i <= count; i++) {
							columnName = rsmd.getColumnName(i);
							maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

							for (int j = 1; j <= maxGap; j++) {
								System.out.printf("%" + maxGap + "s ", "-");
							}

						}

						do {
							for (int i = 1; i <= count; i++) {

								columnName = rsmd.getColumnName(i);
								maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

								if (columnName.contains("NAME")) {
									System.out.printf("%-" + maxGap + "s ", rs.getString(i));
								} else {

									System.out.printf("%" + maxGap + "s ", rs.getString(i));
								}

							}
							System.out.println();
						} while (rs.next());

					}
						break;

					case 3: {
						isExit = false;
					}
						break;

					}
				}

			} else {
				System.out.println("Wrong Choice ");
				continue loop;
			}
		}
		{

		}
	}
}
