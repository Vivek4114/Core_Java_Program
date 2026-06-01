package com.nit.Day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_03_CallProcedure {

		public static void main(String[] args) throws SQLException {
			
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek", "vivek");
			
			CallableStatement c1 = conn.prepareCall("{call getData(?)}");
			c1.setInt(1, 111);
			
			c1.execute();
			System.out.println("Call SuccessFully");
			
		}
}
