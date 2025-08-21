package com.ait.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int f = 20 / 0;
			System.out.println(f);
		} catch (ArithmeticException e) {
			System.out.println(e+" Not allowed");
		}

	}

}
