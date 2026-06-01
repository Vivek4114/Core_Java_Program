package com.nit.collectionIterator40Ques;

import java.util.Vector;

class Student01{
	String name;
	 int age;
	 
	 
	 
	public Student01(String name, int age) {
	 
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}


	 
	 public void setName(String name) {
		 this.name = name;
	 }


	 /**
 	 * @return the age
 	 */
	 public int getAge() {
		 return age;
	 }


	 /**
 	 * @param age the age to set
 	 */
	 public void setAge(int age) {
		 this.age = age;
	 }


	 @Override
	 public String toString() {
		return "Student01 [name=" + name + ", age=" + age + "]";
	 }
	 
	
}

public class ObjectVector {
	
	public static void main(String []args) {
		Student01 s1 = new Student01("Chandu", 21);
		Student01 s2 = new Student01("vivek", 22);
		Student01 s3 = new Student01("Ramu", 21);
		Student01 s4 = new Student01("gaju", 25);
		Student01 s5 = new Student01("Ramesh", 26);
		Student01 s6 = new Student01("Narayan", 29);
		
		Vector<Student01> std = new Vector<Student01>();
		
		std.addElement(s1);
		std.addElement(s2);
		std.addElement(s3);
		std.addElement(s4);
		std.addElement(s5);
		std.addElement(s6);
		
		std.forEach(System.out::println);
		
	}
	

}
