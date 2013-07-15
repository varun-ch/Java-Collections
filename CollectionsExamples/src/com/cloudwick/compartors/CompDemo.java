package com.cloudwick.compartors;

import java.util.TreeSet;

public class CompDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeSet<String> ts = new TreeSet<String>(); //by using default comparator returns result in ascending order
		TreeSet<String> ts = new TreeSet<String>(new MyComp()); //changing the order using user defined comparator 

		ts.add("E");
		ts.add("R");
		ts.add("F");
		ts.add("C");
		ts.add("S");
		ts.add("A");
		ts.add("M");
		
		System.out.println(ts);
		
		
//		TreeSet<Integer> ts1 = new TreeSet<Integer>(); //default-sorts in ascending order
		TreeSet<Integer> ts1 = new TreeSet<Integer>(new MyComp2());
		
		ts1.add(5);
		ts1.add(9);
		ts1.add(1);
		ts1.add(7);
		ts1.add(3);
		
		System.out.println(ts1);
	}

}
