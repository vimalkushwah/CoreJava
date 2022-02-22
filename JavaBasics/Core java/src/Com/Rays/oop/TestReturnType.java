package com.rays.oop;

public class TestReturnType {
		public static Shape getShape (int i) {
			if(i==1)return new Rectangle(8,7);
			if(i==2) return new Circle(5);
		    if(i==3) return new Triangle(4,5);
			return null;
		}
public static void main(String[] args) {
	Shape s=getShape(3);
	s.area();
	System.out.println(s.area());
	
}
	}

