package com.nit.ComparatorInterface;

import java.util.Comparator;
import java.util.Arrays;

class Student1{
	int stdId;
	String studentName;
	int age;
	int marks;
	public Student1( int stdId, String studentName, int age, int marks) {
		super();
		this.studentName = studentName;
		this.stdId = stdId;
		this.age = age;
		this.marks = marks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", stdId=" + stdId + ", age=" + age + ", marks=" + marks
				+ ", getStudentName()=" + getStudentName() + ", getStdId()=" + getStdId() + ", getAge()=" + getAge()
				+ ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 
	
	
	
}

public  class egComparable  {
	
	public static void main(String[] args) {
		
		Student1 s1  = new Student1(102, "Rohan", 18, 85);
        Student1 s2  = new Student1(101, "Priya", 19, 90);
        Student1 s3  = new Student1(109, "Amit", 20, 75);
        Student1 s4  = new Student1(104, "Sneha", 18, 88);
        Student1 s5  = new Student1(107, "Vivek", 21, 92);
        Student1 s6  = new Student1(106, "Kunal", 19, 70);
        Student1 s7  = new Student1(105, "Meena", 20, 95);
        Student1 s8  = new Student1(108, "Rahul", 18, 80);
        Student1 s9  = new Student1(103, "Pooja", 19, 89);
        Student1 s10 = new Student1(110, "Sagar", 21, 77);
        
        Student1 std[]= {s1,s2,s3,s4,s5, s6, s7, s8, s9, s10};
		
		
		Comparator <Student1> compareByUsingId = (o1,o2)-> Integer.compare(o1.getStdId(),o2.getStdId());
		Arrays.sort(std,compareByUsingId);
		
		 for(Student1 s: std) {
			 
			 System.out.println(s.stdId + " " + s.studentName + " " + s.age + " " + s.marks);
		 }
		
		
		
		
	}

	

}
