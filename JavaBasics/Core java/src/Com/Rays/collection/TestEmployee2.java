package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(new Employee2("Shivam", "Patel"));
		a.add(new Employee2("Ravi", "Patel"));
		a.add(new Employee2("Ajay", "Rawat"));
		a.add(new Employee2("Shivam", "Rawat"));
		
		Collections.sort(a ,new OrderByName1());
		Iterator i = a.iterator();
		while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
		}
	}

}
