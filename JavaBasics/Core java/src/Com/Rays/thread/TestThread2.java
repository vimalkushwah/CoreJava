package com.rays.thread;

public class TestThread2 {
	public static void main(String[] args) {
		
		Hellothread t1 = new Hellothread("ram");
		Hellothread t2 = new Hellothread("shyam");
		
		t1.run();
		t2.run();
	}

}
