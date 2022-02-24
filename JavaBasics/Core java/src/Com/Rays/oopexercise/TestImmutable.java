package com.rays.oopexercise;

 final class TestImmutable {
	private final String fName;
	private final String lName;
	private final int a;
	
	public TestImmutable (String f,String l,int a) {
		fName=f;
		lName=l;
		this.a=a;
		}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int geta() {
		return a;
	}
	public static void main(String[] args) {
		TestImmutable t = new TestImmutable("vimal", "kushwah", 10);
		
		System.out.println(t.getfName());
		System.out.println(t.getlName());
		System.out.println(t.geta());
	}

}
