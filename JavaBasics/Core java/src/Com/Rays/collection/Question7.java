package com.rays.collection;

import java.util.LinkedList;

public class Question7 {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(1);
		l.add(3);
		l.add(6);
		l.add(8);
		l.add(6);
		l.add(7);
		l.add(9);
		
		System.out.println("Linked List"+l);
		int middle = (int)l.get(l.size()/2);
		System.out.println("Middle Element:-"+middle);
	}

}
