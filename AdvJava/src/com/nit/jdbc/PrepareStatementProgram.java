package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareStatementProgram {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek","vivek");
			PreparedStatement ps = con.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
