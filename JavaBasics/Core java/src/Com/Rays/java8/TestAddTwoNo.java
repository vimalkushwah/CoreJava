package com.rays.java8;

public class TestAddTwoNo {
	public static void main(String[] args) {
		AddTwoNo add = (a,b) ->{
			System.out.println(a+b);
			return a;
		};add.addTwoNo(10, 15);
	}

}
