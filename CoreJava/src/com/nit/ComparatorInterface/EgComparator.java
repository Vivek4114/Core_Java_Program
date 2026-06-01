package com.nit.ComparatorInterface;

import java.util.Arrays;

class Employee1 implements Comparable<Employee1>{
	private int empid;
	private String empName;
	private double sal;
	private int age;
	private String designation;
	 
	public Employee1(int empid, String empName, double sal, int age, String designation) {
		this.empid = empid;
		this.empName = empName;
		this.sal = sal;
		this.age = age;
		this.designation = designation;
	}
 
	public int getEmpid() {
		return empid;
	}
 
	public void setEmpid(int empid) {
		this.empid = empid;
	}
 
	public String getEmpName() {
		return empName;
	}

 
	public void setEmpName(String empName) {
		this.empName = empName;
	}

 
	public double getSal() {
		return sal;
	}

 
	public void setSal(double sal) {
		this.sal = sal;
	}
 
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

 
	public String getDesignation() {
		return designation;
	}

 
	public void setDesignation(String designation) {
		this.designation = designation;
	}

  
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empName=" + empName + ", sal=" + sal + ", age=" + age + ", designation="
				+ designation + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		 
		return -Double.compare(this.sal, o.sal);
	}
	
	
	
	
}

public class EgComparator  {
	
	public static void main(String[] args) {
		
			Employee1 e1  = new Employee1(110, "Rohit",   45000, 25, "Developer");
	        Employee1 e2  = new Employee1(109, "Priya",   55000, 27, "Tester");
	        Employee1 e3  = new Employee1(108, "Amit",    60000, 30, "Manager");
	        Employee1 e4  = new Employee1(107, "Sneha",   47000, 24, "HR");
	        Employee1 e5  = new Employee1(106, "Sagar",   52000, 26, "Developer");
	        Employee1 e6  = new Employee1(105, "Meena",   58000, 29, "Team Lead");
	        Employee1 e7  = new Employee1(101, "Rahul",   49000, 23, "Support Engg");
	        Employee1 e8  = new Employee1(102, "Kunal",   65000, 31, "Architect");
	        Employee1 e9  = new Employee1(103, "Pooja",   53000, 28, "Consultant");
	        Employee1 e10 = new Employee1(104, "Vivek",   62000, 32, "Senior Dev");
	        
	        Employee1 e[] =  { e1, e2, e3, e4 , e5, e6, e7, e8, e9, e10  };
	        
	        
	       Arrays.sort(e);
	       
	      for(Employee1 emp: e) {
	    	  System.out.println(emp);
	      }
	        
	        
	}

}
