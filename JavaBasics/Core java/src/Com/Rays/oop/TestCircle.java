package com.rays.oop;

public class TestCircle {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		//Shape s=new Shape("red",5);
		c.setBorderWidth(5);
		c.setColor("red");
		
		c.area();
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
		System.out.println(c.getColor());
	}

}
