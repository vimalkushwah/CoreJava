package com.rays.oopexercise;

public class Bank {
	private static String name;
	private static int branchCode;
    public Bank() {}
    public Bank(String n,int bc) {
    	name=n;
    	branchCode=bc;
    }
    public String getName() {
    	return name;
    }
    public static String address() {
    	return (name+branchCode);
    }
}
