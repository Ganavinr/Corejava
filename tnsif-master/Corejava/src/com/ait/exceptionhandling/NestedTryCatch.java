package com.ait.exceptionhandling;

public class NestedTryCatch {
public static void check(){
	String s="Open";
	int slength=s.length();
	System.out.println("string length "+slength);
	String s2=null;
	int y=6;
	try {
		try {
			System.out.println(s.charAt(y));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("String length"+s2.length());
	}
	catch(NullPointerException e) {
		System.out.println(e.getMessage());
	}
}
public static void main(String[] args) {
	NestedTryCatch.check();
}
}
