package com.ait.day6.overriding;

public class Overriding {
	public static void main(String[] args) 
	 {
	  //dynamic binding
	  RBI rbi;
	  
	// HDFC obj= new HDFC();
	// SBI obj1= new SBI();
//	  rbi= new RBI();
//	  System.out.println(rbi.getRateOfInterest());
	  
	  
	  rbi = new SBI();
	  System.out.println(rbi.getRateOfInterest());
	  rbi= new HDFC();
	  System.out.println(rbi.getRateOfInterest());
	  rbi= new ICICI();
	  System.out.println(rbi.getRateOfInterest());
	  
	 }


}
