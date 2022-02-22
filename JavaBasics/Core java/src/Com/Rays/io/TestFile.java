package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("D:\\Books");
		
		if(f.exists()) {
			System.out.println("Name: "+f.getName());
			System.out.println("Path: "+f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isAbsolute());
			System.out.println(f.isFile());
			System.out.println(f.length());
			System.out.println(f.isDirectory());
			System.out.println(new Date(f.lastModified()));
		}
		else {
			System.out.println("file not exist");
		}
	}
}
