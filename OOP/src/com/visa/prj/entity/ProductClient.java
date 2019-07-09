package com.visa.prj.entity;
import java.lang.reflect.Method;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products = new Product[4]; //array of four pointers, pointer if Product class LHS, object of RHS Product
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED");
		products[1] = new Mobile(453, "Moto G", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 35000.00, "LED");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		
		printExpensive(products);
		printInfo(products);
		printInfoOCP(products);
	}
	/*
	 * Print details using Open for extension, closed for change
	 * done using reflection APIs
	 */
	
	private static void printInfoOCP(Product[] products) {
		System.out.println("Using OCP");
		for (Product p: products) {
			Class clazz = p.getClass();
			Method[] methods = clazz.getMethods();//getDeclaredMethods
			for (Method m : methods) {
				if (m.getName().startsWith("get")) {
					try {
						Object ret = m.invoke(p);
						System.out.println(ret);
					}catch(Exception ex){
						ex.printStackTrace();
					}
				}
			}
		}
	}
	private static void printExpensive(Product[] products) {
		for (Product product: products) {
			if (product.isExpensive()) { //polymorphic, dynamic binding, runtime binding
				System.out.println(product.getName() + " is Expensive");
			}
		}
		System.out.println("**************");
	}
	private static void printInfo(Product[] products) {
		for (Product p : products) {
			System.out.println(p.getName() + " : " + p.getPrice());
			if (p instanceof Tv) { //broadly checking, belong to a family
				Tv t =    (Tv) p;
				System.out.println(t.getScreenType());
			}
			if (p.getClass() == Mobile.class) {
				Mobile m = (Mobile) p;
				System.out.println(m.getConnectivity());
			}
		}
		System.out.println("**************");
	}
}
