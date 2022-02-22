package com.rays.oop;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r= new Rectangle(5,6);
		Shape s=new Shape();
		s.setColor("red");
		s.setBorderWidth(5);
		System.out.println(r.area());
		System.out.println(r.getLength());
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}

}
