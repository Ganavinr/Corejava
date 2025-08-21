package com.ait.day8.static1;

public class Employee {
	private String name;
	private int id;
	
	static String collegeName="Atria";

	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +", College= "+collegeName+"]";
	}
	
	
	

}
