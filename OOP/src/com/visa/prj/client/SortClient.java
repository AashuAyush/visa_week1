package com.visa.prj.client;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;

import util.ArrayUtil;

public class SortClient {

	public static void main(String[] args) {
		String[] names = {"Calvin", "a", "B", "d"};
		ArrayUtil.sort(names);
		for(String name : names) {
			System.out.println(name);
		}
		Product[] products = new Product[4]; //array of four pointers, pointer if Product class LHS, object of RHS Product
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED");
		products[1] = new Mobile(453, "Moto G", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 35000.00, "LED");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		
		ArrayUtil.sort(products);
		for (Product p : products) {
			System.out.println(p);
		}
	}
	
}