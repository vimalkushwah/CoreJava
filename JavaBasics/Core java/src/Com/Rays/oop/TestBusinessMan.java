package com.rays.oop;

public class TestBusinessMan {
	public static void main(String[] args) {
		BusinessMan bm=new BusinessMan();
		bm.setadd("indore");
		System.out.println(bm.getadd());
		bm.donation();
		Richman r=new BusinessMan();
		r.earnMoney();
	}

}
