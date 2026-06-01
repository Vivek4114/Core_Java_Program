package com.nit.java25feature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class Test01_JavaSQL {

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Class Loaded..!");

	}

	private static Connection conn = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");
		System.out.println("Connection Eastalblish..!");

		Scanner sc = new Scanner(System.in);
		boolean isLoop = true;
		Statement stmt = conn.createStatement();

		while (isLoop) {

			System.out.print("JAVA-SQL>");

			StringBuilder query = new StringBuilder();
			int count = 1;
			boolean queryLoop = true;
			while (queryLoop) {
				String line = sc.nextLine();
				query.append(line).append("\n");

				if (line.trim().endsWith(";")) {
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

						if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR2") || rsmd.getColumnTypeName(i).equalsIgnoreCase("NVARCHAR2") || rsmd.getColumnTypeName(i).equalsIgnoreCase("CLOB")){
							

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
					
					System.out.println(c+ "Rows Selected");
				} catch (Exception e) {
					System.out.println("Check Syntax");
				} 
				System.out.println();

			} else if (newQuery3.startsWith("INSERT")) {

				try {
					int insertedRow = stmt.executeUpdate(newQuery3);
					System.out.println("\n"+insertedRow + " Row created.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
 
			} else if (newQuery3.startsWith("DELETE")) {

				try {
					int deleteRow = stmt.executeUpdate(newQuery3);
					System.out.println("\n"+deleteRow + " row deleted.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
			} else if (newQuery3.startsWith("CREATE")) {

				try {
					stmt.execute(newQuery3);
					System.out.println("\nTable Created.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
			} else if (newQuery3.startsWith("UPDATE")) {

				try {
					int updateRow = stmt.executeUpdate(newQuery3);
					System.out.println("\n"+updateRow + "row updated.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}

			} else if (newQuery3.startsWith("TRUNCATE")) {
				try {
					stmt.executeUpdate(newQuery3);
					System.out.println("\nTable truncated.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
				
			} else if (newQuery3.startsWith("DROP")) {
				try {
					stmt.executeUpdate(newQuery3);
					System.out.println("\nTable dropped.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
				
			} else if (newQuery3.startsWith("ALTER")) {
				try {
					stmt.executeUpdate(newQuery3);
					System.out.println("\nTable altered.\n\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
				
			} else if (newQuery3.startsWith("RENAME")) {
				try {
					stmt.execute(newQuery3);										//alter modify erro
					System.out.println("\nTable renamed.\n");							// rename
				} catch (Exception e) {
					System.out.println("Check SQL syntax");
				}
			} else if (newQuery3.startsWith("GRANT")) {
				try {
					stmt.executeUpdate(newQuery3);
					System.out.println("\nGrant succeeded.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}

			} else if (newQuery3.startsWith("REVOKE")) {
				try {
					stmt.executeUpdate(newQuery3);
					System.out.println("\nRevoke succeeded.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}

			} else if (newQuery3.startsWith("ROLLBACK")) {
				try {
					stmt.execute(newQuery3);
					System.out.println("\nRollback complete.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}

			} else if (newQuery3.startsWith("SAVEPOINT")) {
				try {
					stmt.execute(newQuery3);
					System.out.println("\nSavepoint created.\n");
				} catch (SQLSyntaxErrorException e) {
					System.out.println("Check SQL syntax");
				}
			}

			else if (newQuery3.startsWith("DESC") || newQuery.startsWith("DESCRIBE")) {

				String tableName = newQuery3.substring(newQuery3.indexOf(" ") + 1).replace(";", "").trim();
				
				System.out.println("\nTable Name " + tableName+"\n");

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
						maxGap =25;
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
				
			} else {
				System.out.println("\nInvalid Query\n");
			}
			if (newQuery3.equalsIgnoreCase("exit;")) {
				System.out.println("Disconnected Succesfully");
				isLoop = false;
				break;
			}
			newQuery3 = "";
			
			sc.close();
			 
			

		}

	}
}
