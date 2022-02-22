package com.rays.oop;

public class Square extends NewShape {
private int side=0;
public Square() {
}
public Square(int a) {
	this.side=a;
}
public int getSide() {
	return side;
}
public double area() {
	return side*side;
}
}
