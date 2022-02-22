package com.rays.oop;

public class TestShape {
	public static void main(String[] args) {
		Shape s=new Shape() ;
		s.setColor("red");
		s.setBorderWidth(5);
		System.out.println("color -"+s.getColor());
		System.out.println("borderwidth -"+s.getBorderWidth());
		}
	
}
