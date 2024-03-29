package com.visa.prj.client;

public class HashStory {

	public static void main(String[] args) {

		String s1 = new String ("Hello");

		String s2 = new String ("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //default implementation from Object class, compares address ? p1.equals(p2) -> gives false
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String ("Aa");
		String s4 = new String ("BB");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
