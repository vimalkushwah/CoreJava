package com.rays.java8;

public class TestConcateString {
	public static void main(String[] args) {
		ConcateString c = (a,b) ->{
			return a+" "+b ;
		};
		String str = c.Concat("Vimal", "Kushwah");
		System.out.println(str);
	}

}
