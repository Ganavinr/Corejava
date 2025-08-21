package com.ait.multithreading;

public class ImplementingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
	}
	public static void main(String[] args) {
		ImplementingRunnable t=new ImplementingRunnable();//why needed?
		Thread t1=new Thread(t);
		t1.start();
	}
	
	

}
