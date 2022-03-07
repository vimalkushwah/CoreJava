package com.rays.java8;

public class TestAnonymous {
	public static void main(String[] args) {
		
	
	AnonymousFunc a = new AnonymousFunc() {

		@Override
		public void hello() {
			System.out.println("hello anonymous function");
			
		}
		};a.hello();

}
	
}