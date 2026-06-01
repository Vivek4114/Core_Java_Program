package com.nit.ComparatorInterface;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;;

class Student11 implements Comparable<Student11>{
	int id;
	String name;
	int marks;
	public Student11(int id, String name, int marks) {
	 
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student11 o1) {		
		return  Integer.compare(this.id,o1.id);
	}
	
	@Override
	public String toString() {
		return "Student11 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	 
	
	
	
}

public class CompanyDetails {
	
	public static void main(String[] args) {
		
		Student11 s1  = new Student11(1, "Amit", 85);
        Student11 s2  = new Student11(2, "Rahul", 78);
        Student11 s3  = new Student11(7, "Sneha", 92);
        Student11 s4  = new Student11(4, "Priya", 88);
        Student11 s5  = new Student11(5, "Kiran", 76);
        Student11 s6  = new Student11(6, "Vikas", 90);
        Student11 s7  = new Student11(3, "Pooja", 81);
        Student11 s8  = new Student11(8, "Nikita", 74);
        Student11 s9  = new Student11(9, "Rohan", 95);
        Student11 s10 = new Student11(10, "Sumit", 67);

        Student11 s11 = new Student11(11, "Sarthak", 89);
        Student11 s12 = new Student11(15, "Komal", 93);
        Student11 s13 = new Student11(13, "Arjun", 72);
        Student11 s14 = new Student11(14, "Meera", 84);
        Student11 s15 = new Student11(12, "Deepak", 77);
        Student11 s16 = new Student11(16, "Chetan", 91);
        Student11 s17 = new Student11(17, "Rita", 66);
        Student11 s18 = new Student11(18, "Nilesh", 82);
        Student11 s19 = new Student11(19, "Payal", 87);
        Student11 s20 = new Student11(20, "Jay", 79);
        
        
        Student11 std[] = { s1, s2, s3, s4, s5 , s6, s7,s8, s9,s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20};
        
        
        System.out.println("Sort by useing Id");
        Arrays.sort(std);
        
        for(Student11 s : std) {
        	System.out.println(s);
        }
        
        System.out.println();
        System.out.println("Sort by useing Name");	
        Comparator <Student11> sortByName = Comparator.comparing(obj1 -> obj1.getName());
        
        Arrays.sort(std,sortByName); 
        for(Student11 s : std) {
        	System.out.println(s);
        }
        
        
        System.out.println();     
        System.out.println("Sort by useing Id Reverse Order");
        Comparator <Student11> sortByIdRev = (o1, o2) -> Integer.compare(o1.id, o2.id); 
        Comparator<Student11> rev = sortByIdRev.reversed();
        Arrays.sort(std,rev); 
        for(Student11 s : std) {
        	System.out.println(s);
        }
        	
        	System.out.println();
        	System.out.println("Sort by Usieng Marks");
        	Comparator <Student11> sortByMarks = (e1, e2) -> Integer.compare(e1.marks, e2.marks);
        	Comparator <Student11> revMarks = sortByMarks.reversed();
        	 Arrays.sort(std,revMarks); 
        	 
             for(Student11  s: std) {
             	System.out.println(s);
             }
        	
        	
        	
        }
      

		
	}


