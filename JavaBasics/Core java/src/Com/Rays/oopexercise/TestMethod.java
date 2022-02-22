package com.rays.oopexercise;

import com.rays.javabasicexercise.traingle;

public class TestMethod {
	public static void main(String[] args) {
		Shape []s = new Shape[3];
		s[0] = new Circle(10);
		s[1] = new Rectangle(15,18);
		s[2] = new Traingle(24,65);
		double totalArea=calcArea(s);
		System.out.println(totalArea);
	}
	public static double calcArea(Shape[] s) {
		
		double totalArea=0;
		for(int i = 0; i<s.length; i++) {
			totalArea = totalArea + s[i].area();
			System.out.println(s[i].area());
		}
		return totalArea;
	}
}
