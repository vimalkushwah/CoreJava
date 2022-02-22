package com.rays.oopexercise;

public class StaticPolymorphism {
	public void add(int a , int b) {
		System.out.println(a + b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a + b + c);
	}
	public void add(double a, int b,double c) {
		System.out.println(a + b + c);
		 
	}
	public static void main(String[] args) {
		StaticPolymorphism a=new StaticPolymorphism();
		a.add(10, 15);
		a.add(20.0, 10, 25.5);
	}

}
