package com.rays.oop;

public class BusinessMan extends Person implements Richman, SocialWorker{
	private String name;
	private String add;

	@Override
	public void helpToOther() {
		System.out.println("help to other");
	}

	@Override
	public void earnMoney() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("giving donation");
		
	}

	@Override
	public void party() {
		System.out.println("enjoy party");
		
	}

}
