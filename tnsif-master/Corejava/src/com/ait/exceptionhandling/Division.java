package com.ait.exceptionhandling;

public class Division {

	public static void main(String[] args) {
		int a=20,b=0,c;
		try {
			c=b/a;
			System.out.println(c);
//			c=a/b;
			try {
				c=a/b;
			}
			catch (Exception e) {
				System.out.println(e+" in nest");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
