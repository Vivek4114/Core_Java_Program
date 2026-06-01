package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test04_Delete_stmt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		Statement stmt = conn.createStatement();
		
		
		int rowsDeleted = 0;
		
		rowsDeleted += stmt.executeUpdate(
					"""
					delete from course01
					where course_name='Oracle'
					"""
					);
		
		System.out.println(rowsDeleted + " rows are deleted");
		
		//5.closing connection
		stmt.close();
		conn.close();
		
	}

}
