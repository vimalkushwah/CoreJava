package com.rays.thread;

public class Hellothread2 {
	private String name;
	
	public Hellothread2(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+""+name);
			
		}
	}

}
