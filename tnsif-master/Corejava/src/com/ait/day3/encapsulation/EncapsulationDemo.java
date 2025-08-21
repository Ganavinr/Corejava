package com.ait.day3.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		EncapsulationEx obj = new EncapsulationEx();
		obj.setSerialNum(20);
		obj.setAge(20);
		obj.setName("Bharath V");
		//direct access
		System.out.println("USN:"+obj.getSerialNum());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Name:"+obj.getName());
		//using toString()
		System.out.println(obj.toString());
	}

}
