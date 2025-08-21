package com.ait.day6.polymorphism;

public class MethodOverLoading {
	
	public static int addition(int a,int b) {
		return a+b;
		
	}
	public static int addition(int a,int b,int c) {
		return a+b+c;
		
	}
	public static int addition(int a,float b) {
		
		return (int) (a+b);
		
	}
	
	

}
