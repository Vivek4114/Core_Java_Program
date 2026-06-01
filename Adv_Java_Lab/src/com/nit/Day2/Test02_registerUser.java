package com.nit.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02_registerUser {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// class Loaded

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##vivek", "vivek");
		// Connection Establish

		System.out.println("Enter 1 for Register  ");
		System.out.println("Enter 2 for Login  ");

		System.out.println("Enter Your choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter the EmployeeId");
			int empid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Employee full Name");
			String fullName = sc.nextLine();
			System.out.println("Enter the Salary");
			double sal = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Email id ");
			String emailId = sc.nextLine();
			System.out.println("Enter the emp phno");
			long empPhNo = sc.nextLong();

			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO  EMPLOYEEINFO(EMPID, EMPNAME, EMPSAL, EMPMAILID, EMPPHNO) VALUES(?,?,?,?,?)");

			pstmt.setInt(1, empid);
			pstmt.setString(2, fullName);
			pstmt.setDouble(3, sal);
			pstmt.setString(4, emailId);
			pstmt.setLong(5, empPhNo);

			pstmt.executeUpdate();

			PreparedStatement pstmt1 = conn.prepareStatement(
					"UPDATE employeeInfo " + "SET FNAME =  SUBSTR(EMPNAME,1, INSTR(EMPNAME, ' ') -1), "
							+ "LNAME  =  SUBSTR(EMPNAME, INSTR(EMPNAME, ' ')+1) ");

			pstmt1.executeUpdate();
			operationPerfrom(conn);

			System.out.println("Registed Successfull");

		}
			break;

		case 2: {
			System.out.println("Enter the Empid ");
			int empId = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the First Name Enter Name Camel Case  : ");
			String fname = sc.nextLine();

			PreparedStatement query3 = conn
					.prepareStatement("SELECT * FROM EMPLOYEEINFO where EMPID = ? AND FNAME = ?");
			query3.setInt(1, empId);
			query3.setString(2, fname);

			ResultSet rs = query3.executeQuery();

			while (rs.next()) {

				if (rs.getInt(1) == empId && rs.getString(6).equalsIgnoreCase(fname)) {
					System.out.println("Login SuccessFul");
					operationPerfrom(conn);
				} else {
					System.out.println("Invalid Process");
				}
			}
		}
			break;
		default:
			System.out.println("Enter Valid Choice ");
		}

	}

	public static void operationPerfrom(Connection conn) throws SQLException {

		abc: while (true) {
			System.out.println("1 Show all Employee");
			System.out.println("2. update mailId  and phone Number based on id ");
			System.out.println("3. Delete Employee whose salary between 5000 - 7000 ");
			System.out.println("4. Increase 10% salary");
			System.out.println("5. Exit..!");

			System.out.println("Enter Your Choice");
			int ch = sc.nextInt(); sc.nextLine();

			switch (ch) {
			case 1: {
				PreparedStatement query1 = conn.prepareStatement("SELECT *  FROM EMPLOYEEINFO");
				ResultSet rs = query1.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				String columnName;
				int maxGap;
				int count = rsmd.getColumnCount();

				for (int i = 1; i <= count; i++) {
					columnName = rsmd.getColumnName(i);
					maxGap = Math.max(columnName.length(), rsmd.getPrecision(i));
					System.out.printf("%" + maxGap + "s ", columnName);
				}
				System.out.println();

				for (int i = 1; i <= count; i++) {
					columnName = rsmd.getColumnName(i);
					maxGap = Math.max(columnName.length(), rsmd.getPrecision(i));
					for (int j = 1; j <= maxGap; j++) {
						System.out.printf("%s", "-");
					}
					System.out.print(" ");
				}
				System.out.println();

				int count1 = 0;
				while (rs.next()) {
					for (int i = 1; i <= count; i++) {
						columnName = rsmd.getColumnName(i);
						maxGap = Math.max(columnName.length(), rsmd.getPrecision(i));
						System.out.printf("%" + maxGap + "s ", rs.getString(i));
					}
					System.out.println();
					count1++;

				}

				System.out.println("\n " + count1 + " Rows Are Displayed..!");

			}
				break;
			case 2: {
				System.out.println("Enter new mail Id  for employee");
				String mail = sc.nextLine();

				System.out.println("Enter new phone number for employee");
				long phno = sc.nextLong();
				System.out.println("Enter current emp id ");
				int id = sc.nextInt();

				PreparedStatement query1 = conn
						.prepareStatement("UPDATE EMPLOYEEINFO SET MAILD = ? , EMPPHNO = ? WHERE EMPID = ?");

				query1.setString(1, mail);
				query1.setLong(2, phno);
				query1.setInt(3, ch);
				query1.executeUpdate();
				//UPDATE EMPLOYEEINFO SET MAILD = 's' AND EMPPHNO = ? WHERE EMPID = ?

				System.out.println("Query Updated Successfully..!");

			}
				break;

			case 3: {
				PreparedStatement query1 = conn
						.prepareStatement("DELETE FROM EMPLOYEEINFO WHERE EMPSAL BETWEEN 5000 AND 7000 ");
				query1.executeUpdate();

				System.out.println("\n\nDELETED EMPLOYEE WHOSE SAL BETWEEN 5000 - 7000 ");

			}
				break;
			case 4: {
				PreparedStatement query1 = conn
						.prepareStatement("UPDATE EMPLOYEEINFO SET  EMPSAL= EMPSAL + EMPSAL * (10 / 100) ");
				query1.executeUpdate();

				System.out.println(" \nALL ROWS ARE UPDATED..!");

			}
				break;
			case 5:
				System.err.println("Database Disconnected");
				break abc;

			default:
				System.out.println("Choice is Wrong please enter Valid choice");

			}

		}

	}

}
