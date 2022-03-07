package com.rays.java8;

import java.util.ArrayList;

public class TestForeach {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(223);
		a.add(565);
		a.add(654);
		a.add(764);
		a.add(565);
		
		a.forEach(li -> System.out.println(li));
	}   

}
