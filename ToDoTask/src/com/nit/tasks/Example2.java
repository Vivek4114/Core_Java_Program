package com.nit.tasks;

import java.util.Objects;

class Employee{
	int  id ;
	String name;
 
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee )
			return true;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}

public class Example2 {

}
