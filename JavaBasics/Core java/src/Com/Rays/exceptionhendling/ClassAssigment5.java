package com.rays.exceptionhendling;

public class ClassAssigment5 {
	public static void main(String[] args) {
		try {
			System.out.println(15/0);
			//System.exit(0);
		}catch(ArithmeticException p) {
			System.out.println(p.getMessage());
			
	 System.exit(0);
		}
		finally {
			System.out.println("ok");
		}
		
		

}
}