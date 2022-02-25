package com.rays.collection;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmployeeID(30);
		e1.setFname("Vimal");
		e1.setLname("Kushwah");
		
		Employee e2 = new Employee();
		e2.setEmployeeID(30);
		e2.setFname("Vimal");
		e2.setLname("Kushwah");
		
		System.out.println("Shallow Comparision: "+ (e1==e2));
		
		System.out.println("Deep Comparision: "+ (e1.equals(e2)));
		
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println(e2.hashCode());
	}

}
