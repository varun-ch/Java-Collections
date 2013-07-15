package com.cloudwick.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

import javax.management.Query;

public class PQExample extends Query {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<String>();// default capacity is 11
																 

		pq.add("E");
		pq.add("R");
		pq.add("V");
		pq.add("C");
		pq.add("D");
		pq.add("T");
		pq.add("B");
		System.out.println(pq);// head of the element ll be the smallest
		
		pq.offer("A");
	
		
		System.out.println(pq);

		while (!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");// removed in the sorted order

		}
		System.out.println();
		System.out.println(pq); // now the queue is empty

		// poll and remove are same but behaves differently when queue is empty
		System.out.println(pq.poll());// retuns null
		System.out.println(pq.remove()); // returns "NoSuchElementException"

	}

}