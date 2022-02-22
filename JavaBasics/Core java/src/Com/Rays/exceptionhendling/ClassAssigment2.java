package com.rays.exceptionhendling;

public class ClassAssigment2 {
	public static void main(String[] args) {
		try {
			String i="rama";
			System.out.println(i.charAt(3));
			
		}catch(IndexOutOfBoundsException p) {
			System.out.println("small String");
		
		try {
			String s = "shyam";
		System.out.println(s.length());
		}catch(NullPointerException n) {
			System.err.println(n.getMessage());
	}finally {
		System.out.println("done");
	}
	}finally {
		System.out.println("ok");
	}
	}
}
