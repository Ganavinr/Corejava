package com.ait.day7.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Shape s;//dynamic binding or create object for subclasses 
		
		s=new Rectangle();
		s.calArea();
		s.show();
		s=new Square();
		s.calArea();
		s.show();

	}

}
