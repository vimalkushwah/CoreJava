package com.rays.oop;

public class Automobile {
	private String color=null;
	private int speed=00;
	private String make=null;
	
	public static final int NO_OF_GEARS=5;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void getBreak() {
		System.out.println("stop");
	}
	public void changeGear(int j) {
		
		switch(j) {
		case 1:
			System.out.println("normal speed"+j);
		break;
		case 2:
			System.out.println("speed 40-60"+j);
			break;
		case 3:
			System.out.println("speed 60-80"+j);
			break;
		case 4:
			System.out.println("speed 80-100"+j);
			break;
		case 5:
			System.out.println("speed 100-120"+j);
			break;
		default :
			System.out.println();
		}}
	public void accelerator(char a ) {
		switch(a) {
		case 'a':
			System.out.println("");
		 
		}
		
	}
}
