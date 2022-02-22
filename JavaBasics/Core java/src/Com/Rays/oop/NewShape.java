package com.rays.oop;

public abstract class NewShape {
		private String color=null;
		private int borderWidth=0;
		public static final double PI=3.14;
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getBorderWidth() {
			return borderWidth;
		}
		public void setBorderWidth(int borderWidth) {
			this.borderWidth = borderWidth;
		}
		public abstract double area();
		

	}


