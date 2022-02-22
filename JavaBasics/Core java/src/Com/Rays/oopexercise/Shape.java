package com.rays.oopexercise;

public abstract class Shape {
	private int borderWidth=0;
	private String color=null;
	public static final double PI=3.14;
	
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double area();
	


}
