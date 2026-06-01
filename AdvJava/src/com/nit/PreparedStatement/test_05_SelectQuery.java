package com.nit.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class test_05_SelectQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from course01");
		int rowCount= 0; 

		if (rs.next()) {

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			int maxGap;
			String columName;

			for (int i = 1; i <= columnCount; i++) {
				columName = rsmd.getColumnName(i);
				maxGap = Math.max(rsmd.getPrecision(i), columName.length());
				System.out.printf("%-" + maxGap + "s ", columName);

			}

			System.out.println();

			for (int i = 1; i <= columnCount; i++) {
				columName = rsmd.getColumnName(i);
				maxGap = Math.max(rsmd.getPrecision(i), columName.length());

				StringBuilder sb = new StringBuilder();
				sb.repeat("-", maxGap);
				System.out.print(sb + " ");
			}
			
			System.out.println();
			do {
				for (int i = 1; i <= columnCount; i++) {
					columName = rsmd.getColumnName(i);
					maxGap = Math.max(rsmd.getPrecision(i), columName.length());
					if (columName.contains("NAME")) {
						System.out.printf("%-" + maxGap + "s " , rs.getString(i));
					} else {
						System.out.printf("%" + maxGap + "s ", rs.getString(i));
					}
					
					
				}
				rowCount++;
				System.out.println();

			} while (rs.next());

		}
		
		System.out.println("\n"+ rowCount + " rows is Selected..!");

	}

}
