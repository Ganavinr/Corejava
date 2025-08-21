package com.ait.day7.interface1;

public class BankApplication {
	public static void main(String[] args) {
		 Bank bank = new BankImp();
		 Account acc= new Account(111,"ganavi",20000,bank);
		 acc.deposit(2000); System.out.println(acc);
		 acc.withdraw(1899); 
		 System.out.println(acc);
		
	}

}
