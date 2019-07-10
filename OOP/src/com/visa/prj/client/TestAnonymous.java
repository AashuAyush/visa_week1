package com.visa.prj.client;

@FunctionalInterface
interface Computation{
	int compute (int x, int y);
}

public class TestAnonymous {

	public static void main(String[] args) {
		Computation c1 = new Computation() {
			
			@Override
			public int compute(int x, int y) {
				return x+y;
			}
		};
		
		/*
		 * Java 8 introduced Lambda Expression as a shorter form for Anonymous class
		 * 
		 * Limitation Interface should have only one method to implement
		 */

		System.out.println(c1.compute(5, 4));
		Computation c2 = (int x, int y) -> {
			return x-y;
		};
		System.out.println(c2.compute(5,4));
		
		//Type interface, return as per the method of interface, if void same behaviour
		Computation c3 = (x,y) -> x*y;
		System.out.println(c3.compute(5, 4));
		
	}
	
}
