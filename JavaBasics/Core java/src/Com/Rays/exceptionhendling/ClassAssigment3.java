package com.rays.exceptionhendling;

public class ClassAssigment3 {
	public static void main(String[] args) {
		try {
			System.out.println(5/1);
			
		}catch(ArithmeticException a) {
			a.printStackTrace();
			
		}finally {
			System.out.println("shree");
			try {
				String s = "ram";
				System.out.println(s.charAt(1));
			}catch(NullPointerException f) {
				System.out.println(f.getMessage());
			}finally {
				System.out.println("done!!");
			}
			
		}
	}

}
