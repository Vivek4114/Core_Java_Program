package com.nit.Day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Test03_CallableStatement {
	public static void main(String []args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##vivek","vivek");
		
		CallableStatement call = con.prepareCall("{call insertStudent(?,?,?,?,?,?,?,?,?)}");
		
		System.out.println("Enter the Student Id ");
		int id = sc.nextInt();
		System.out.println("Enter the Student Roll Number ");
		int roll = sc.nextInt();sc.nextLine();
		System.out.println("Enter the Student Name ");
		String name = sc.nextLine();
		System.out.println("Enter the Student Branch ");
		String branch = sc.nextLine();
		System.out.println("Enter the Student hno ");
		String hno  = sc.nextLine();
		System.out.println("Enter the Student city ");
		String city = sc.nextLine();
		System.out.println("Enter the Student pin ");
		int pin = sc.nextInt(); sc.nextLine();
		System.out.println("Enter the Student mail ");
		String  mail = sc.nextLine(); 		
		System.out.println("Enter the Student Phone Number  ");
		long  phone = sc.nextLong();
		
		call.setInt(1, id);
		call.setInt(2, pin);
		call.setString(3, name);
		call.setString(4,branch);
		call.setString(5, hno);
		call.setString(6, city);
		call.setInt(7, pin);
		call.setString(8, mail);
		call.setLong(9, phone);
		
		
		call.execute();
		System.out.println(" Program Execute Successfully");
		call.close();
		con.close();
		
		
	}

}
