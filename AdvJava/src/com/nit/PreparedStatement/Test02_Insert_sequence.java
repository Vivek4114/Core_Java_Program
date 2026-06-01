package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02_Insert_sequence {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		Statement stmt = conn.createStatement();

		stmt.execute("""
					INSERT INTO course01(course_id, course_name, course_fee)
					VALUES(course_seq.nextval, 'Core Java', 3500)
				""");

		stmt.execute("""
				INSERT INTO course01(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, 'Oracle', 2500)

				""");

		stmt.execute("""
				INSERT INTO course01(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, 'HTML, CSS, JS', 2500)

				""");
		
		stmt.execute("""
				
				INSERT INTO course01(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, 'Adv Java', 3500)

				""");
		
		
		conn.close();
		stmt.close();
		
		System.out.println("Connection Closed..!");

	}
}
