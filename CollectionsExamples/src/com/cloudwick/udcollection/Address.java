package com.cloudwick.udcollection;

public class Address {

	private String fname;
	private String lname;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String fn, String ln, String s, String ct, String st, String c) {
		fname = fn;
		lname = ln;
		street = s;
		city = ct;
		state = st;
		code = c;

	}

	public String toString() {
		return fname + "\n" + lname + "\n" + street + "\n" + city + " " + state
				+ " " + code;
	}
}
