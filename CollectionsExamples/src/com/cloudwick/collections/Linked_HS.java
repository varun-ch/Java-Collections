package com.cloudwick.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_HS extends HashSet<String> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
//		lhs.add(2);
//		lhs.add(5);
//		lhs.add(1);
		
		lhs.add("E");
		lhs.add("R");
		lhs.add("F");
		lhs.add("C");
		lhs.add("S");
		lhs.add("A");
		lhs.add("M");

		System.out.println(lhs);//return in same order in which they are inserted
		
	}

}