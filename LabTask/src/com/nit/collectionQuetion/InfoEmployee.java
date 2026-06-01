package com.nit.collectionQuetion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int empid;
	String ename;
	double salary;
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
  
}

public class InfoEmployee {
	
	public static void displayEmpDetails(ArrayList<Employee> emp) {
		
		 
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(101,"Vivek", 20000));
		emp.add(new Employee(102, "Rahul", 50000));
		emp.add(new Employee(103, "Chandu", 4000));
		
		Comparator<Employee> s = (emp1, emp2) -> Double.compare(emp2.salary, emp1.salary);		
		Collections.sort(emp,s); 		
		System.out.println("Print the Element");
		
		for(Employee e: emp) {
			System.out.println(e);
		}
	 
	 
	}

}
