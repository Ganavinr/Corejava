package com.tnsif.basic;

public class Palindrome {
	public static boolean check(String s) {
		if(s==null||s.isEmpty()){
			return true;
		}
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r))return false;
			l++;
			r--;
			
		}
		return true;
	}

	public static void main(String[] args) {
		String s=" ";
		System.out.println(Palindrome.check(s));
		
		

	}

}
