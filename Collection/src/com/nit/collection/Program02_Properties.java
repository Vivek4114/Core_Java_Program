package com.nit.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Program02_Properties {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("D:\\TextImageFilesLobs1\\hello.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties pr = new Properties();
		try {
			pr.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pr.getProperty("driver"));
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));
	 
	}

}
