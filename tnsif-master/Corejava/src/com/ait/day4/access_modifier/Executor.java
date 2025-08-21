package com.ait.day4.access_modifier;

public class Executor {

	public static void main(String[] args) {
		
				Base b1= new Base();
				b1.varDefault=40;
				b1.varPublic=70;
				b1.varProtected=90;
				b1.setVarPrivate(80);
				b1.getVarPrivate();
				b1.methodDefault();
				b1.methodProtected();
				b1.methodPublic();
//				b1.methodPrivate();

		

	}

}
