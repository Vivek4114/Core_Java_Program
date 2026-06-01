package com.nit.javaSQL;
import java.time.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test01_Java_SQL_New {
	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static Connection conn = null;
	// private static String[] useName;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
		// "c##vivek", "vivek");

		Scanner sc = new Scanner(System.in);
		boolean isLoop = true;
		Statement stmt = null;

		
		// this msg for class printing on the console
		
		 LocalDateTime lc = LocalDateTime.now();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy"
		 		+ "");
		  
		System.out.println(
				"SQL*Plus: Release 21.0.0.0.0 - Production on "+ lc.format(dtf)+" " + "Version 21.3.0.0.0\r"
						+ "\r\n" + "Copyright (c) 1982, 2021, Oracle.  All rights reserved.\r\n" + "");
		aa: while (true) {
			System.out.print("Enter user-name :"); // here asking user name
			String fulUser = sc.next();sc.nextLine();

			if (!fulUser.endsWith(";") && fulUser.contains("/")) {
				String names[] = fulUser.split("/");

				String userName = names[0];
				String pwd = names[1];

				if (userName != "" && pwd != "") {

					try {

						conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", userName, pwd);
						System.out.println("Last Successful login time: " +  lc.format(dtf) +" +05:30\n" + "\n"
								+ "Connected to:\n "
								+ "Oracle Database 21c Enterprise Edition Release 21.0.0.0.0 - Production\r\n"
								+ "Version 21.3.0.0.0");
						stmt = conn.createStatement(); // if connected successfully then exit
						break;
					} catch (Exception e) {

						System.out.println("\nERROR:\r\n" + "ORA-01017: invalid username/password; logon denied"); // otherwise
																														// throw
																														// this
																														// msg
						continue aa;

					}

				}
			} else if (!fulUser.endsWith(";") && !fulUser.contains("/")) {
				System.out.print("Enter Your Passward : ");
				String pwd = sc.next();sc.nextLine();

				if (fulUser != "" && pwd != "") {
					try {

						conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", fulUser, pwd);
						System.out.println("Last Successful login time: Wed Dec 17 2025 12:06:32 +05:30\r\n" + "\r\n"
								+ "Connected to:\r\n"
								+ "Oracle Database 21c Enterprise Edition Release 21.0.0.0.0 - Production\r\n"
								+ "Version 21.3.0.0.0\b");
						stmt = conn.createStatement();
						break;

					} catch (Exception e) {

						System.out.println("\nERROR:\r\n" + "ORA-01017: invalid username/password; logon denied");
						continue aa;

					}

				}

			}

			else {
				System.out.println("\nERROR:\r\n" + "ORA-01017: invalid username/password; logon denied");
			}

		}

		while (isLoop)

		{

			System.out.print("JAVA-SQL>");

			StringBuilder query = new StringBuilder();
			int count = 1;
			boolean queryLoop = true;
			while (queryLoop) {
				String line = sc.nextLine();
				query.append(line).append("\n");

				if (line.trim().endsWith(";")) {
					count=1;
					queryLoop = false;

				} else {

					System.out.print(" " + (++count) + " ");
				}

			}

			String newQuery = query.toString().trim();

			String newQuery1 = newQuery.toUpperCase();
			String newQuery3 = newQuery1.substring(0, newQuery1.length() - 1);

			if (newQuery3.startsWith("SELECT")) {

				try {

					ResultSet rs = stmt.executeQuery(newQuery3);

					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					int maxGap;
					String columName;
					System.out.println();

					for (int i = 1; i <= columnCount; i++) {

						if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR2")
								|| rsmd.getColumnTypeName(i).equalsIgnoreCase("NVARCHAR2")
								|| rsmd.getColumnTypeName(i).equalsIgnoreCase("CLOB")) {

							columName = rsmd.getColumnName(i);

							maxGap = Math.max(columName.length(), rsmd.getPrecision(i));
							System.out.printf("%-" + maxGap + "s ", columName);
						} else {
							columName = rsmd.getColumnName(i);

							maxGap = Math.max(columName.length(), rsmd.getPrecision(i));
							System.out.printf("%" + maxGap + "s ", columName);
						}

					}

					System.out.println();
					for (int i = 1; i <= columnCount; i++) {

						columName = rsmd.getColumnName(i);
						maxGap = Math.max(columName.length(), rsmd.getPrecision(i));

						for (int j = 1; j <= maxGap; j++) {
							System.out.printf("%s", "-");
						}
						System.out.print(" ");

					}
					System.out.println();

					rs.next();
					int c = 0;
					do {

						for (int i = 1; i <= columnCount; i++) {
							columName = rsmd.getColumnName(i);
							maxGap = Math.max(columName.length(), rsmd.getPrecision(i));
							if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR2")) {
								System.out.printf("%-" + maxGap + "s ", rs.getString(i));
							} else {
								System.out.printf("%" + maxGap + "s ", rs.getString(i));

							}
						}
						c++;
						System.out.println();
					} while (rs.next());

					System.out.println(c + " Rows Selected");
				} catch (Exception e) {
					System.out.println("ERROR at line 1:\r\n"
							+ "ORA-00923: FROM keyword not found where expected");
				}
				System.out.println();

			} else if (newQuery3.startsWith("INSERT") || newQuery3.startsWith("UPDATE")
					|| newQuery3.startsWith("DELETE") || newQuery3.startsWith("TRUNCATE")
					|| newQuery3.startsWith("DROP") || newQuery3.startsWith("GRANT") || newQuery3.startsWith("REVOKE")
					|| newQuery3.startsWith("ALTER")) {
				int row = 0;
				try {
					row = stmt.executeUpdate(newQuery3);
					if (newQuery3.startsWith("INSERT")) {
						System.out.println("\n" + row + " Row created.\n");
					} else if (newQuery3.startsWith("UPDATE")) {
						System.out.println("\n" + row + "row updated.\n");
					} else if (newQuery3.startsWith("DELETE")) {
						System.out.println("\n" + row + "row deleted.\n");
					} else if (newQuery3.startsWith("DROP")) {
						System.out.println("\nTable dropped.\n");
					} else if (newQuery3.startsWith("TRUNCATE")) {
						System.out.println("\nTable truncated.\n");
					} else if (newQuery3.startsWith("ALTER")) {
						System.out.println("\nTable altered.\n\n");
					} else if (newQuery3.startsWith("REVOKE")) {
						System.out.println("\nRevoke succeeded.\n");
					} else {
						System.out.println("\nGrant succeeded.\n");
					}

				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}

			} else if (newQuery3.startsWith("CREATE") || newQuery3.startsWith("RENAME")
					|| newQuery3.startsWith("ROLLBACK") || newQuery3.startsWith("SAVEPOINT")) {

				try {
					stmt.execute(newQuery3);
					if (newQuery3.startsWith("CREATE"))
						System.out.println("\nTable Created.\n");
					else if (newQuery3.startsWith("RENAME"))
						System.out.println("\nTable renamed.\n");
					else if (newQuery3.startsWith("ROLLBACK"))
						System.out.println("\nRollback complete.\n");
					else
						System.out.println("\nSavepoint created.\n");

				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
			} else if (newQuery3.startsWith("DESC") || newQuery.startsWith("DESCRIBE")) {

				String tableName = newQuery3.substring(newQuery3.indexOf(" ") + 1).replace(";", "").trim();

				System.out.println("\nTable Name " + tableName + "\n");

				String newQuery4 = "SELECT COLUMN_NAME, DATA_TYPE, DATA_LENGTH  FROM USER_TAB_COLUMNS  WHERE TABLE_NAME = '"
						+ tableName.toUpperCase() + "' ORDER BY COLUMN_ID";
				ResultSet rs = null;
				try {
					rs = stmt.executeQuery(newQuery4);
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					String columnName;
					int maxGap;

					for (int i = 1; i <= columnCount; i++) {
						columnName = rsmd.getColumnName(i);
						maxGap = 25;
						System.out.printf("%" + maxGap + "s ", columnName);

					}
					System.out.println();

					for (int i = 1; i <= columnCount; i++) {
						columnName = rsmd.getColumnName(i);
						maxGap = 25;

						for (int j = 1; j <= maxGap; j++) {
							System.out.printf("%s", "-");
						}
						System.out.print(" ");
					}
					System.out.println();

					while (rs.next()) {
						for (int i = 1; i <= columnCount; i++) {
							columnName = rsmd.getColumnName(i);
							maxGap = 25;

							System.out.printf("%" + maxGap + "s ", rs.getString(i));
						}
						System.out.println();
					}

				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
				System.out.println();

			} else if (newQuery3.equalsIgnoreCase("EXIT;")) {
				System.out.println("Disconnected Succesfully\n");
				isLoop = false;
				break;
			}

			else {
				System.out.println("\nInvalid Query\n");
			}

			newQuery3 = "";

		}

	}
}
