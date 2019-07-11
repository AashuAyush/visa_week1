package com.visa.prj.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String str = new String("java is oop and java is distributed and java is simple");
		
		String[ ] words  = str.split("\\s");
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set unique = new HashSet();
		for (String w : words) {
			if (!unique.contains(w)) unique.add(w);
		}
		for (Object w : unique) {
			
		}
//		Map<String, Integer> getWordFrequency(String str)
	}

}
