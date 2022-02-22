package com.rays.oop;

import com.rays.javabasicexercise.traingle;

public class Triangle extends Shape {
	private int base;
	private int hight;
	public Triangle() {}
	public Triangle(int b,int h) {
		base=b;
		hight=h;
	}
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	public double area() {
		return (double)1/2*base*hight;
	}

}
