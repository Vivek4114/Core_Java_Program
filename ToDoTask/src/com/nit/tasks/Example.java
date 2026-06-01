package com.nit.tasks;

class Parent {
	String name;
	int id;

	public Parent(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", id=" + id + "]";
	}

}

class Child extends Parent {

	String stdName;
	String stdid;

	public Child(String name, int id, String stdName, String stdid) {
		super(name, id);
		this.stdName = stdName;
		this.stdid = stdid;
	}

}

public class Example {

}
