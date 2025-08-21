package com.ait.day7.abstraction;

public class Square extends Shape{
	
	private float side;
	
	public Square() {
		this.side=4.0f;
	}

	@Override
	void calArea() {
		area=side*side;
		
	}
	

}
