package com.rays.thread;

public class TestAccount extends Thread {
	public static Account a = new Account();
	private int amount;
	private String name;
	
	public TestAccount(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i <5 ; i++) {
			a.deposite(name, 1000);
			
		}
	}
	public static void main(String[] args) {
		TestAccount t1 = new TestAccount("ram");
		TestAccount t2 = new TestAccount("shyam");
		
	t1.start();
	t2.start();
	}

}
