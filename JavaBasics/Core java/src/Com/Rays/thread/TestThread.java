package com.rays.thread;

public class TestThread {
	public static void main(String[] args) {
		
		Hellothread t1 = new Hellothread("ram");
		Hellothread t2 = new Hellothread("shyam");
		
		t1.start();
		t2.start();
		t1.setPriority(10);
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i+""+"main");
			
		}
	}

}
