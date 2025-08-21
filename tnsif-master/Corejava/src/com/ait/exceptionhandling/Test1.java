package com.ait.exceptionhandling;

public class Test1 {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Java");
		}
		catch(Exception e){
			System.out.println("hello");
		}
		finally {
			System.out.println("Welcome to Python");
		}
		
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally with catch");
		}
		
		try {
			System.out.println(100/0);
		}
		finally {
			System.out.println("Zero");
		}

	}

}
