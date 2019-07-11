package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondExample {

	public static void main(String[] args) {
		List <Integer> i1 = Arrays.asList(1,66, 3, 77,2);
		List <String> s1 = Arrays.asList("one", "two", "three");
		
		print(i1);
		print (s1);
		
		List <Integer> copyInt = new ArrayList<>();
		List <String> copyStr = new ArrayList<>();
		
		copy (copyStr,s1);
		copy (copyInt, i1);
		System.out.println(copyInt);
		System.out.println(copyStr);
		
	}
	private static  void print (List <?> list) { //access is allowed with ?, no modification
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
//	private static <T> void copy (List<T> dest, List<T> src) {
//		for (T o : src) {
//			dest.add(o);
//		}
//	}
	
	// PECS - producer extends consumer super
	private static <T> void copy (List<? super T> dest, List<? extends T> src) { // super can't be used on src, like mobile can't point to product
		for (T o : src) {
			dest.add(o);
		}
	}

}
