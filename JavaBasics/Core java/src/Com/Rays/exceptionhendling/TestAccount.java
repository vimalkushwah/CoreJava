package com.rays.exceptionhendling;

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account("234577655","saving",5000);
		System.out.println(a.getAccountNo());
		System.out.println(a.getAccountType());
		System.out.println(a.getBal());
		a.withdraw(3000);
		System.out.println(a.getBal());
		a.withdraw(500);
		a.getBal();
		a.withdraw(1100);	
		
	}

}
