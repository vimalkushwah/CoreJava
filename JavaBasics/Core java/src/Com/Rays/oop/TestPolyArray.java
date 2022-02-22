package com.rays.oop;

public class TestPolyArray {
	public static void main(String[] args) {
		Shape s[]=new Shape[3];
		s[0]=new Circle(5);
		s[1]=new Rectangle(5,4);
		s[2]=new Triangle(8,9);
		double totalArea=calcArea(s);
		System.out.println("total area -"+totalArea);
		 
	}
	public static double calcArea(Shape[]s) {
		double totalArea=0;
		for(int i=0;i<s.length;i++) {
			totalArea+=s[i].area();
		System.out.println(s[i].area());
		}
		return totalArea;
	}
	

}
