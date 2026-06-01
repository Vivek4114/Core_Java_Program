package com.nit.jdbc.DemoProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SequenceProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		Statement stmt = conn.createStatement();

		final String course_seq = """
				CREATE SEQUENCE course_seq
				start with 1
				increment by 1
				""";

		final String student_seq = """
				CREATE SEQUENCE student_seq
				start with 1
				increment by 1

				""";

//		 stmt.execute(course_seq);
//		 stmt.execute(student_seq)

		stmt.executeUpdate("""

				INSERT INTO course(course_id, course_name, course_fee)
				VALUES(course_seq.NEXTVAL, 'core java', 3500)
						""");

		stmt.executeUpdate("""
				    INSERT INTO course(course_id, course_name, course_fee)
				    VALUES(course_seq.NEXTVAL, 'html css', 2000)
				""");

		stmt.close();
		conn.close();

		System.out.println("Connection Closed..");

	}

}
