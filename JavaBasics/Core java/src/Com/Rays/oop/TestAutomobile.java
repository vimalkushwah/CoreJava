package com.rays.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile am= new Automobile();
		am.setColor("Brown");
		System.out.println("Color=" +am.getColor());
		am.setMake("Suzuki");
		System.out.println("Make by=" +am.getMake());
		am.getBreak();
		am.changeGear(1);
		
		
	}

}
