package com.nit.jdbc.DemoProgram;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
interface Animal{}

class Dog implements Animal{ }
class Tiger implements Animal{ }
class Lion implements Animal{ }
class Elephant implements Animal{ }

class LooseCoupling{
	public static void main(String []args) throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Animal Name : " );
	String name = sc.next();
	 Class cls = Class.forName("com.nit.jdbc.DemoProgram." + name);
   	Object	obj = cls.getDeclaredConstructor().newInstance();
   	Animal a = (Animal) obj;
   	System.out.println("Class is : " + a.getClass());
	 
	
	
	}
}
