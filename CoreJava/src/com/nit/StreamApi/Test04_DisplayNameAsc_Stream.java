package com.nit.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//wap  to create a student with their names rollno section  sort and display
//their detils in assending order there rollno

//it used to sort the the element in Natural Sorting Order if they are String
// if they ae string we can use comparator in sort the integer based on our requirement.

 

public class Test04_DisplayNameAsc_Stream {
	
	public static void main(String[] args) {
		
		 List<Student> std = Arrays.asList(
				 new Student("Vivek", 1, 'A'),
				 new Student("Chandu", 2, 'B'),
				 new Student("Abhay", 7, 'C'),
				 new Student("RajKumar", 2, 'A'),
				 new Student("Rahul", 1, 'D')
				 );
		 
	  std.stream().
	  sorted(Comparator.comparing(s-> s.getRollno())).
	  collect(Collectors.toList()).
	  forEach(e -> System.out.println(e.getRollno() + " " + e.getName()));
	}

}

class Student{
	String name;
	int rollno;
	char section;
	public Student(String name, int rollno, char section) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.section = section;
	}
	 
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	 
	public int getRollno() {
		return rollno;
	}
	 
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	 
	public char getSection() {
		return section;
	}
	 
	public void setSection(char section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", section=" + section + "]";
	}
	
}


