package com.rays.exceptionhendling;

public class InsufficiantFund extends Exception {
	public InsufficiantFund() {
		super("minimum 500 needed");
	}

}
