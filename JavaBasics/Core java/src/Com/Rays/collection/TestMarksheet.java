package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestMarksheet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		m1.setFname("Rahul");
		m1.setLname("Rathor");
		m1.setRollNo("30");
		m1.setPhy(55);
		m1.setChem(65);
		m1.setMaths(89);
		
		Marksheet m2 = new Marksheet();
		m2.setFname("Rahul");
		m2.setLname("Kumar");
		m2.setRollNo("31");
		m2.setPhy(45);
		m2.setChem(55);
		m2.setMaths(66);
		
		Marksheet m3 = new Marksheet();
		m3.setFname("Vikash");
		m3.setLname("Thakre");
		m3.setRollNo("45");
		m3.setPhy(84);
		m3.setChem(76);
		m3.setMaths(89);
		
		ArrayList a = new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		Collections.sort(a, new OrderByName());
         Iterator i = a.iterator();
         while(i.hasNext()) {
        	 Object o = i.next();
        	 System.out.println(o);
         }
         
         
	}

}
