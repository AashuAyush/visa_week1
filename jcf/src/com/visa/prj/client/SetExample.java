package com.visa.prj.client;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.visa.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
		
		String str = "we are the world we are the children";
		Set<String> uniqueSet = new HashSet<>();
		Set<String> duplicateSet = new HashSet<>();
		String[ ] words  = str.split("\\s");
		for (String w: words) {
			if (uniqueSet.contains(w)) {
				uniqueSet.remove(w);
				duplicateSet.add(w);
			}
			else uniqueSet.add(w);
		}
		System.out.println(uniqueSet);
		System.out.println(duplicateSet);
	
 		
//		Set<Product> products = new HashSet<>(); // whenever 70% full, doubles the size
//		Set<Product> products = new HashSet<>(100);
//		Set<Product> products = new TreeSet<>();
		Set<Product> products = new TreeSet<>((p1, p2) -> {
			int diff = Double.compare(p1.getPrice(), p2.getPrice());
			if (diff == 0) {
				diff = p1.getId() - p2.getId();
				
			}
			return diff;
		});
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer", 100));
		products.add(new Product(224, "iPhone", 98000.00, "mobile", 500));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer", 300));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv", 900));
		products.add(new Product(912, "One Plus", 32000.00, "mobile", 100));
		products.add(new Product(88, "HP Printer", 19000.00, "computer", 100));
		for (Product p : products) {
			System.out.println(p);
		}
	}

}
