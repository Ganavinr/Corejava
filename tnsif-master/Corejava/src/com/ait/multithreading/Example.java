package com.ait.multithreading;

public class Example {
	static synchronized void display() {
		Thread t=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(t.getName()+" "+i);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				
			}
		}
	}

}
