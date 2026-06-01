package com.nit.FirstProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program1_Establish_Connetion {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uName = "c##vivek";
	String pwd = "vivek";
	String selectQuery = "Select * from employee";
	String insertQuery = "Insert into Employee values(107, 'raj', 'paikrao', 22283, 'guntur' )";
	String deleteQuery = "Delete from Employee where eid = 107";
	String updateQuery = " update employee set sal = 65020 where eid = 1 ";

	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dbUrl, uName, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	void selectEmployeeTable() {
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			System.out.println("-----------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4)
						+ "\t" + rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void insertEmployeeData() {
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			int colCount = stmt.executeUpdate(insertQuery);

			if (colCount == 1) {
				System.out.println("Data Inserted SuccessFully");
			} else {
				System.out.println("Data is not Inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		selectEmployeeTable();
	}

	void deleteEmpQuery() {
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			int colunCount = stmt.executeUpdate(deleteQuery);

			if (colunCount == 1) {
				System.out.println("Data is Deleted  SuccessFully");
			} else {
				System.out.println("Data is not Deleted ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Are you want to see the data");
		Scanner sc = new Scanner(System.in);
		char choice = sc.nextLine().charAt(0);

		switch (choice) {
		case 'y', 'Y':
			selectEmployeeTable();
			break;
		case 'n', 'N':
			System.exit(0);
			break;
		default:
			System.out.println("you are choice the wrong choice");
		}

	}

	void updateEmpData() {
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			int colCount = stmt.executeUpdate(updateQuery);

			if (colCount == 1) {
				System.out.println("Data is Upated");
			} else {
				System.out.println("DAta is not Updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Program1_Establish_Connetion pec = new Program1_Establish_Connetion();
		// pec.insertEmployeeData();
		// pec.deleteEmpQuery();
		pec.updateEmpData();
		//pec.selectEmployeeTable();
	}
}
