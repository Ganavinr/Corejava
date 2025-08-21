package com.ait.lambdaexpression;

public class Demo implements Message {

	@Override
	public String greet() {
		
		return "Welcome";
	}
	public static void main(String[] args) {
		Demo m=new Demo();
		System.out.println(m.greet());
	}

}
