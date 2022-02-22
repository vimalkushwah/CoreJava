package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(56);
		list.add('v');
		list.add(7);
		list.add("vk");
			
		
		System.out.println(list);
		
		ArrayList l= new ArrayList<>();
		
		l.add(5);
		l.add(56);
		l.add("rays");
		l.add('b');
		l.add(34.5);
		l.retainAll(list);
		System.out.println(l);
		}
	}
	


