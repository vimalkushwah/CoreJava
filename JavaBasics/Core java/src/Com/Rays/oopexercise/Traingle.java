package com.rays.oopexercise;

public class Traingle extends Shape {
	private int base;
	private int hight;
	public Traingle() {}
	public Traingle(int b,int h) {
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
		return 1/2*base*hight;
		
	}

}
