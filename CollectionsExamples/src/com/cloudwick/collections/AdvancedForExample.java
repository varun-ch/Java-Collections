package com.cloudwick.collections;

import java.util.ArrayList;

public class AdvancedForExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();//default capacity is 10
	

		int v = 1;
		while (v < 10) {
			al.add(v + 1);
			v += 2;
		}

		System.out.println(al);

		//advanced for loop which works similar to an iterator
		for (int i : al) {
			System.out.println(i);
		}
		
		int sum=0;
		for (int i : al) {
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}

}