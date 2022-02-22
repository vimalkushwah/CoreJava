package com.rays.oopexercise;

public class Rectangle extends Shape {
	private int len;
    private int wd;
    public Rectangle() {}
	public Rectangle(int l,int w) {
	 len=l;
	 wd=w;
	 }
	public int getLength() {
		return len;
	}
	public int getWidth() {
		return wd;
	}
	public double area() {
	
	return len*wd;
	}
    }
