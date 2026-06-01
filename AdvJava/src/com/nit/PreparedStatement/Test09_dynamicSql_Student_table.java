package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test09_dynamicSql_Student_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		String query = """
					INSERT INTO student01(sid, sname,  course_id, fee )  VALUES(student_seq.nextVal, ? , ? , ?)
				""";

		Statement stmt = conn.createStatement();

		PreparedStatement pstmt = conn.prepareStatement(query);

		String choice;

		do {

			System.out.println("Enter the student name : ");
			String sname = sc.nextLine();

			System.out.print("Enter course Name: ");
			String name = sc.nextLine();
			
			String query1 = "SELECT course_id FROM course01 where course_name = '" + name + "'";
			ResultSet rs = stmt.executeQuery(query1);
			rs.next();
			int courseId = rs.getInt(1);
			
			String query2 = "SELECT course_fee FROM course01 where course_name = '" + name + "'";
			ResultSet rs2 = stmt.executeQuery(query2);
			rs2.next();
			double fee = rs2.getDouble(1);

			pstmt.setString(1, sname);
			pstmt.setInt(2, courseId);
			pstmt.setDouble(3, fee);

			pstmt.execute();

			System.out.println("Enter Your Choide [Y/N]");
			choice = sc.nextLine();

		} while (choice.equalsIgnoreCase("Y"));

		sc.close();

	}
}
