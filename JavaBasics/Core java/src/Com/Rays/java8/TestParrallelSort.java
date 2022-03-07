package com.rays.java8;

import java.util.Arrays;

public class TestParrallelSort {
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7,8,3,5,6,8};
		
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
