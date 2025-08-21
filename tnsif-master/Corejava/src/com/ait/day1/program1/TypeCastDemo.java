package com.ait.day1.program1;

public class TypeCastDemo {

	public static void main(String[] args) {
		//implicit
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		//explicit
		
		float f2=67.90f;
		int f1=(int)f2;
		System.out.println(f1);
		
	    //implicit
		
		int c=12;
		double s=c;
		System.out.println(s);
		
		//explicit
		
		double d2=67.90d;
		byte d1=(byte)d2;
		System.out.println(d1);
	}

}
