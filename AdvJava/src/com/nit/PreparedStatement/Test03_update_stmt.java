package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test03_update_stmt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		Statement stmt = conn.createStatement();
		
		int rowsUpdated = 0;
		
		rowsUpdated += stmt.executeUpdate(
					"""
					update course01
					set course_fee=5500
					where course_name='Core Java'
					"""
					);
		
		rowsUpdated += stmt.executeUpdate(
					"""
					update course01
					set course_fee=4500
					where course_name='Oracle'
					"""
					);
		
		rowsUpdated += stmt.executeUpdate(
					"""
					update course01
					set course_fee=10500
					where course_id=5
					"""
					);

		
		System.out.println(rowsUpdated + " rows are updated");
		
		//5.closing connection
		stmt.close();
		conn.close();
	}
	 
}
