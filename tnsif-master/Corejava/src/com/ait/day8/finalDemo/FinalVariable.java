package com.ait.day8.finalDemo;

public class FinalVariable {
	 final int x=100;
	 final static int Y;//declared and not initialized
	 final static int Z=10;
	 
	 void change() {
//		 x=30;
//		 Y=100;cannot change
	 }

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	 
	 static {
		 Y=20;
//		 Z=100;Initialized above cannot change
		 System.out.println("Value of Y:"+Y);
	 }

}
