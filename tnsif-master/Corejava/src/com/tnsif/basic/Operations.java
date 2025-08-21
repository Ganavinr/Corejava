package com.tnsif.basic;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter two values");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Product: "+a*b);
//		
//		
//		System.out.println("Division: "+a/b);
//		
//		if(a>b)System.out.println("a is greater");
//		else System.out.println("b is greater");
		
		
		System.out.println("Enter N:");
		int n=sc.nextInt();
		int sum=0;
		int fact=1;
		for(int i=0;i<=n;i++) {
			sum+=i;
			
		}
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		System.out.println(sum);
		System.out.println(fact);
		
		
		
	}
}
