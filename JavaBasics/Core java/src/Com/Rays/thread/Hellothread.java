package com.rays.thread;

public class Hellothread extends Thread {
	private String name;
	
	public Hellothread(String name) {
		this.name = name;
	}
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 50; i++) {
			System.out.println(i+""+name);
			
		}
	}

}
