package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test01_DynamicSQL {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek", "vivek");
	 
		 String query = """
					INSERT INTO course01(course_id, course_name, course_fee )  VALUES(course_seq.nextVal, ? , ? )
				""";
		 
		 PreparedStatement pstmt = conn.prepareStatement(query);
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String choice;
		 
		do {
		 
		 System.out.println("Enter the Course Name : ");
		 String courseName = sc.nextLine(); 
		 
		 System.out.println("Enter the Course Fee  : ");
		 double fee = sc.nextDouble(); sc.nextLine();
		 
		 pstmt.setString(1, courseName);
		 pstmt.setDouble(2, fee); 
 
		 pstmt.execute();
		 
		 System.out.println("Enter Your Choide [Y/N]");
		 choice = sc.nextLine();
		}
		while(choice.equalsIgnoreCase("Y"));
		
		sc.close();
	 
	}

}
