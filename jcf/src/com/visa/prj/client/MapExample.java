package com.visa.prj.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample { //Map produces     collection

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("Java", 533.44);
		map.put("Oracle", 533.4);
		map.put("Java", 533.00); // overwrites
		
		System.out.println(map.get("Java"));
		
		Set<String> keys = map.keySet();
		for (String key: keys) {
			System.out.println(key + " : "+ map.get(key));
		}
		
		keys.forEach(System.out::println);
		map.forEach((k, v) -> System.out.println(k + " : " + v));//BiConsumer annnnnd traversal faster now
	}

}
