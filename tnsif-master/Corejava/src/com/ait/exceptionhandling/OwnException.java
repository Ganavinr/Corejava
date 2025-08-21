package com.ait.exceptionhandling;

import java.util.Scanner;

public class OwnException {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18) {
			throw new Exception("Minimum Age Requirement not met");
		}
		else {
			System.out.println("Approved");
		}

	}

}
