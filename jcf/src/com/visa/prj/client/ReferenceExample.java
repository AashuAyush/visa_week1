package com.visa.prj.client;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {

	public static void main(String[] args) {
		SoftReference <String> wr = new SoftReference<String>(new String("Hello"));
//		WeakReference <String> wr = new WeakReference<String>(new String("Hello"));
		
		System.out.println(wr.get());
		
		System.gc(); // request for gc, cleans weak reference pointer
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(wr.get());
	}

}
