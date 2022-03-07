package com.rays.java8;

public interface DefaultMethod {
	public default void defMethod() {
		System.out.println("new");
	}
	public static void testSta() {
		System.out.println("Test Static");
	}

}
