package com.ait.day3.constructor;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p= new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the Income:");
		int income=sc.nextInt();
		System.out.println("Enter the Gender:");
		String gender=sc.next();
		System.out.println("Enter the tax:");
		int tax=sc.nextInt();
		
		System.out.println("Details of the Person:\nName:"+name+"\nAge:"+age+"\nIncome:"+income+"\nGender:"+gender+"\nTax:"+tax);
		
		

	}

}
