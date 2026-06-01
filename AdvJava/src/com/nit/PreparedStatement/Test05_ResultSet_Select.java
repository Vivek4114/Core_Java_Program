package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.lang.ClassCastException;
public class Test05_ResultSet_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException ,ClassCastException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");
		
		Statement stmt = conn.createStatement();
		
		
		
		ResultSet rs =  stmt.executeQuery("SELECT * FROM course01");
				
		 while(rs.next()) {
			 System.out.println(
					 rs.getInt(1) + " \t "+
					 rs.getString(2) + " \t "+ 
					 rs.getDouble(3)
					 
					 );
		 }
		 ResultSetMetaData rsmd = rs.getMetaData()  ;
					int columcount = rsmd.getColumnCount();
		 for(int i = 1;  i <=columcount; i++ ) {
					System.out.println(rsmd.getColumnName(i) + " \t" + rsmd.getColumnTypeName(i) + " (" + rsmd.getPrecision(i) + ") \t" );
					
		 }
	
		 	rs.close();
		 	stmt.close();
		 	conn.close();
		 		 	
		 	
		 	System.out.println("Closed the STatement");
		
		
	}

}
