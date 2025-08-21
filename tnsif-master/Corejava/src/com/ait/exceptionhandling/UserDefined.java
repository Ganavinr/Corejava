package com.ait.exceptionhandling;

import java.util.Scanner;

public class UserDefined {
	private static int age;
	static void validate() throws Age{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age<18) {
			throw new Age("Invalid Age, You are not ELIGIBLE");
			
		}else {
			System.out.println("You can Vote");
		}
	}
}
