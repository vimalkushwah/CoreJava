package com.rays.oop;

public class Circle extends Shape  {
	private int radius;
	public Circle() {}

	public Circle(int i) {
		radius=i;
	}

	public int getRadius() {
		return radius;
	}

	
	public double area() {
		return (double)PI*radius*radius;
		
		
	}

}
