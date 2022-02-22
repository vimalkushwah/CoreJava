package com.rays.exceptionhendling;

public class ClassAssigment1 {
	public static void main(String[] args) {
		try {
		
		int i=12;
		int j=2;
		int k=i/j;
		System.out.println(k);
		
		try {
			String a =null;
			System.out.println(a.length());
		}catch(NullPointerException b) {
			System.out.println("null");
			
		}finally {
			System.out.println("okey");
			
		}
		}
		catch(ArithmeticException e){
		System.out.println("Do not divid by zero");
	}
	finally {
		System.out.println("i am finally");
	}
	}
}