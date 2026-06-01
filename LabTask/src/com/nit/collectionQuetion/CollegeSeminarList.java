package com.nit.collectionQuetion;

import java.util.ArrayList;

public class CollegeSeminarList {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();

		slist.add(new Student(1, "Prashant", 21));
		slist.add(new Student(2, "Ravindra", 22));
		slist.add(new Student(3, "Rohit", 25));
		slist.add(new Student(4, "mahesh", 32));

		for (Student s : slist) {
			System.out.println(s);
		}

		System.out.println();
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}

	}

}

class Student {
	int rollno;
	String sname;
	int age;

	public Student(int rollno, String sname, int age) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", age=" + age + "]";
	}

}
