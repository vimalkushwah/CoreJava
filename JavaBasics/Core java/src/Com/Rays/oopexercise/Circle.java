package com.rays.oopexercise;

public class Circle extends Shape{
	private int radius=0;
	public Circle() {}
	public Circle(int i) {
		radius=i;
		
	}

	public int getRadius() {
		return radius;
	}
   public double area() {
	   return PI*radius*radius;
	}
    }
