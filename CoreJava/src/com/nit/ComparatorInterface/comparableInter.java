package com.nit.ComparatorInterface;

class Student{
	int studentId ;
	String name;
	int age ;
	double avg;
	
	
	public Student(int studentId, String name, int age, double avg) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.avg = avg;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	 
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", avg=" + avg + "]";
	}
	
	
	
	
}

public class comparableInter {
	 
		 
	
	public static void main(String[] args) {
		
		Student s1  = new Student(101, "Amit",     20, 85.4);
        Student s2  = new Student(102, "Rohit",    21, 78.2);
        Student s3  = new Student(103, "Sneha",    19, 91.3);
        Student s4  = new Student(104, "Priya",    22, 74.5);
        Student s5  = new Student(105, "Vikas",    20, 88.0);
        Student s6  = new Student(106, "Rani",     21, 69.7);
        Student s7  = new Student(107, "Kiran",    23, 82.1);
        Student s8  = new Student(108, "Pooja",    20, 90.6);
        Student s9  = new Student(109, "Sameer",   22, 77.3);
        Student s10 = new Student(110, "Meera",    19, 84.9);
        
        Student std[] = new Student[10];
        
        
        
	}

}
