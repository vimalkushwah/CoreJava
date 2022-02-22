package com.rays.oop;

public class TestPolymorphism {
	public static void main(String[] args) {
		
	/*Shape s=new Rectangle(5,6);
	s.setBorderWidth(7);
	s.setColor("blue");
	System.out.println(s.area());
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());*/
		
		/*Shape s=new Triangle(8,9);
		System.out.println(s.area());*/
		
		Shape s=new Circle(5);
		System.out.println(s.area());
			
		
	
	}
}