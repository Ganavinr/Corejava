package com.ait.lambdaexpression;

public class MainMethod {

	public static void main(String[] args) {		
			Message m=()->{
				return "Welcome";			
			};
			System.out.println(m.greet());
		}
}
