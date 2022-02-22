package com.rays.exceptionhendling;

public class TestException {
	public static void main(String[] args) {
		
	
		try {
			double div=15/0;
			System.out.println(div);
		}catch(ArithmeticException e){
			System.out.println("not div by zero");
			System.err.println("not div by zero");
			
	}

}
}