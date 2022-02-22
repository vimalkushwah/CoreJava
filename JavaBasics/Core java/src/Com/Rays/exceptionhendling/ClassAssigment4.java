package com.rays.exceptionhendling;

public class ClassAssigment4 {
	public static void main(String[] args) {
		try {
	System.out.println(20/0);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("okey");
		}
	}

}
