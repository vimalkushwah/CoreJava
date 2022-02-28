package com.rays.collection;

import java.util.Comparator;

public class OrderByName1 implements Comparator<Employee2> {
	
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		if(e1.getlName() == e2.getlName());
		return e1.getfName().compareTo(e2.getfName());

}
}
