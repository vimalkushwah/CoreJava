package com.rays.oop;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t=new Triangle(8,10);
		t.setBorderWidth(10);
		t.setColor("blue");
		System.out.println(t.area());
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
	}

}
