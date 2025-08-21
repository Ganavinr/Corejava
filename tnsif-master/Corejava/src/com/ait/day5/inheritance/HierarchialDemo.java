package com.ait.day5.inheritance;

public class HierarchialDemo {

	public static void main(String[] args) {
		Person p;
		p=new Student1("Ganavi","Bangalore","6th sem",97.5f);
		System.out.println(p);
		p=new Employee("ISE","Bangalore",020,20000,"Ganavi");
		System.out.println(p);

	}

}
