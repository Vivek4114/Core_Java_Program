package com.nit.PreparedStatement;
 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test01_sequence {
	
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
	 
		//4. Preparing queries to create sequences
	 	Class.forName("oracle.jdbc.driver.OracleDriver");
	 	
	 	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek", "vivek");
	 	
	 	Statement stmt = conn.createStatement();
	 	
	 	
	 	String courseTableSeq = """
	 			
	 			CREATE SEQUENCE course_seq01
	 			START WITH 1
				INCREMENT BY 1
	 			
	 			"""
		   ;  

		String studentTableSeqQuery =
				"""
				CREATE SEQUENCE student_seq01
				START WITH 101
				INCREMENT BY 1
				"""; 
		//5. executing queries
		stmt.execute(courseTableSeq );
		System.out.println("Course_Seq is created");
		
		stmt.execute(studentTableSeqQuery);
		System.out.println("Student_Seq is created");
		
		//6.closing connection
		stmt.close();
		conn.close();
		
	}
}
