package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccount("Saving");
		System.out.println("type -"+ac.getAccount());
		ac.setNo("26774311234");
		System.out.println("acc no -"+ac.getNo());
		ac.setBal(23000.54);
		System.out.println("total ammount -"+ac.getBal());
		ac.deposit(500);
		System.out.println(ac.getBal());
		ac.withdraw(2000);
		System.out.println(ac.getBal());
		ac.fundTransfer(500);
		System.out.println(ac.getBal());
		ac.payBil(100);
		System.out.println(ac.getBal());

	}

}
