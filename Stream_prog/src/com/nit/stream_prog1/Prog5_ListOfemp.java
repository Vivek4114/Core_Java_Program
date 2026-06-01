package com.nit.stream_prog1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Department {

	String deptName;
	List<emp> empList;

	public Department(String deptName, List<emp> empList) {
		super();
		this.deptName = deptName;
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", empList=" + empList + "]";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<emp> empList) {
		this.empList = empList;
	}

}

record emp(int empId, String empName) {
}

public class Prog5_ListOfemp {

	public static void main(String[] args) {

		List<Department> list = List.of(
				new Department("It",
						List.of(new emp(1, "vivek"), new emp(2, "suresh"), new emp(3, "ramesh"), new emp(4, "vikas"))),
				new Department("Consultancy",
						List.of(new emp(1, "anil"), new emp(2, "karan"), new emp(3, "tejas"), new emp(4, "aniket"))),
				new Department("Service",
						List.of(new emp(1, "Aakash"), new emp(2, "gaurav"), new emp(3, "abhi"), new emp(4, "aanand")))

		);

		List<emp> collect = list.stream().flatMap(s -> {
			System.out.println("Depatment : " + s.getDeptName());
			return s.getEmpList().stream();
		}).collect(Collectors.toList());
		
		collect.stream().distinct().sorted((s,b)-> s.empId() - b.empId()).forEach(System.out::println);
		
		
	}

}
