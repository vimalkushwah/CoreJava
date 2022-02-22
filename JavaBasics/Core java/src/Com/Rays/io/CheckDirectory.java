package com.rays.io;

import java.io.File;

public class CheckDirectory {
	public static void main(String[] args) {
		File f = new File("c:");
		String[] list = f.list();
		if(f.isFile()) {
			System.out.println(f);
		}
		else {
			System.out.println("file not found");
		}
		
	}

}
