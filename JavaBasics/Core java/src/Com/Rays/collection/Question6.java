package com.rays.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question6 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		TreeSet t = new TreeSet();
		LinkedHashSet l = new LinkedHashSet();
		
		h.add("Zero");
		h.add("One");
		h.add("Two");
		h.add("Three");
		h.add("Four");
		h.add("Five");
		h.add("Six");
		h.add("Seven");
		h.add("Eight");
		h.add("Nine");
		h.add("Ten");
		
		Iterator i = h.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			System.out.println("Print for Hashset\n"+s);
		}
	
		t.add("Zero");
		t.add("One");
		t.add("Two");
		t.add("Three");
		t.add("Four");
		t.add("Five");
		t.add("Six");
		t.add("Seven");
		t.add("Eight");
		t.add("Nine");
		t.add("Ten");
		
		Iterator i1 = t.iterator();
		while (i1.hasNext()) {
			String s1 = (String)i1.next();
			System.out.println("Print for Treeset \n "+s1);
			
		}
				
		
		l.add("Zero");
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");
	    l.add("Six");
		l.add("Seven");
		l.add("Eight");
		l.add("Nine");
		l.add("Ten");
		
		Iterator i2 = l.iterator();
		while (i2.hasNext()) {
			String s2 = (String) i2.next();
			System.out.println("Print for LinkedHashset\n"+s2);
		}
		
		
	}

}
