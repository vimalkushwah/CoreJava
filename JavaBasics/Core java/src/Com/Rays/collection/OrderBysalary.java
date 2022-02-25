package com.rays.collection;

import java.util.Comparator;

public class OrderBysalary implements Comparator<Employee1>{
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	      return o2.getSalary()+o1.getSalary();
	}

}
