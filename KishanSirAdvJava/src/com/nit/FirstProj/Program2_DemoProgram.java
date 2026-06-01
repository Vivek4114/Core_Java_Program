package com.nit.FirstProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2_DemoProgram {
	
	Connection con = null;
	String selectQuery = "Select * from employee";
	{  
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek", "vivek");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void runSelctQuery() {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println(rs.getString(1) +"\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getShort(1) + "\t"+rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
	Program2_DemoProgram pg = new Program2_DemoProgram();
	pg.runSelctQuery();
		
	}

}
