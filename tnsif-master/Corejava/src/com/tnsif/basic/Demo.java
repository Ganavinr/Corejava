package com.tnsif.basic;

public class Demo {
	int USN;
	String name;
	int age;
	
	public void show() {
		System.out.println("USN:"+USN+"\nName:"+name+"\nAge:"+age);
	}
public static void main(String[] args) {
	Demo e=new Demo();
	e.USN=20;
	e.name="Bharath V";
	e.age=20;
	
	e.show();
	
}
}
