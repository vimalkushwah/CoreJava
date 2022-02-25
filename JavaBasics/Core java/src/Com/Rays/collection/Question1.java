package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		
		a.add("Rays");
		a.add("Technology");
		a.add("Indore");
		System.out.println(a);
		Iterator<Object> i = a.iterator();
		while(i.hasNext()) {
			Object o = (Object)i.next();
			System.out.print(o);
		}
	}

}
