package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Question8 {
	public static void main(String[] args) {
		Stack s = new Stack();

		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		s.push("g");
		s.push("h");
		s.push("i");
		s.push("j");
		s.push("k");
		s.push("l");
		s.push("m");
		s.push("n");
		s.push("o");
		s.push("p");
		s.push("q");
		s.push("r");
		s.push("s");
		s.push("t");
		s.push("u");
		s.push("v");
		s.push("w");
		s.push("x");
		s.push("y");
		s.push("z");

		Stack s1 = new Stack();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			
			String c = (String) s.pop();
			s1.push(c);
			System.out.print(s1.pop());
		}
		/*
		 * for(int i=1; i<s.size(); i++) {
		 * 
		 * String c = (String)s.pop(); s1.push(c); System.out.print(s1.pop()); }
		 */

	}

}
