package com.rays.java8;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConcurrentCollection {
	public static void main(String[] args) {
		
	
	
	ArrayBlockingQueue a = new ArrayBlockingQueue(0);
	a.add(32);
	a.add(56);
	a.add(86);
	
	Iterator it = a.iterator();
	
	while(it.hasNext()) {
		
		
	}
	
	}
}
