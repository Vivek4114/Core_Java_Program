package com.nit.jdbc.DemoProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		// Create 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek", "vivek");	
		
		Statement stmt = conn.createStatement();
		
//		stmt.execute(
//			"""
//				CREATE TABLE xyz(
//					x NUMBER(2),
//					y VARCHAR2(10),
//					z FLOAT
//					)	
//				
//				"""	
//				
//				);
//		
//		
//		
//		stmt.execute( """
//				
//				INSERT INTO xyz(x,y,z) VALUES (10,'V', 10.4)
//				
//				"""
//				);
//		
//		
//		stmt.execute( """
//				
//				INSERT INTO xyz(x,y,z) VALUES (20,'R', 9.5)
//				
//				"""
//				);
//		
//		stmt.execute( """
//				
//				INSERT INTO xyz(x,y,z) VALUES (30,'B', 5)
//				
//				"""
//				);
		

//		stmt.execute( """
//				
//				UPDATE  xyz SET x = x+50;
//				where x = 10;		
//				"""
//				)

		
		stmt.execute( """
				
				DELETE FROM xyz 
				where x = 20		
				"""
				);
		
		
		conn.close();
		stmt.close();
		
		System.out.println("Connection Close");
		
	}

}
