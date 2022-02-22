package com.rays.oop;

public class Rectangle extends Shape {
	private int len;
	private int wd;
	public Rectangle() {}
	public Rectangle(int l,int w) {
	    len=l;
		wd=w;
	
	}
	public double area() {
		
		return len*wd;
	}
	public int getLength() {
		return len;
	}

}
