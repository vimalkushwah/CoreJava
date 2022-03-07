package com.rays.java8;

public class TestMultiplication {
	public static void main(String[] args) {
		Multiplication m = (a,b)->{
			System.out.println(a*b);
			return a;
		};m.Multplication(25, 15);
	}

}
