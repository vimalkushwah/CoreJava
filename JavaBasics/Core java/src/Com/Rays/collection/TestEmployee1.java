package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(new Employee1("jaiveer", "nahta", 25000));
		a.add(new Employee1("nishil", "sharma", 27000));
		a.add(new Employee1("shivam", "patel", 29000));
		
		/*
		 * Employee1 e1 = new Employee1(); e1.setFname("Rahul"); e1.setLname("Kumar");
		 * e1.setSalary(16000);
		 * 
		 * Employee1 e2 = new Employee1(); e2.setFname("Vikash"); e2.setLname("Thakre");
		 * e2.setSalary(18000);
		 * 
		 * Employee1 e3 = new Employee1(); e3.setFname("Indar"); e3.setLname("Patel");
		 * e3.setSalary(25000);
		 * 
		 * Employee1 e4 = new Employee1(); e4.setFname("Shivam"); e4.setLname("Patel");
		 * e4.setSalary(26000);
		 * 
		 * ArrayList a = new ArrayList(); a.add(e1); a.add(e2); a.add(e3); a.add(e4);
		 */
		
		Collections.sort(a, new OrderBysalary());
		Iterator i=a.iterator();
		while(i.hasNext()) {
		Object o=i.next();
		System.out.println(o);

		}
		}
	}
	

//}
