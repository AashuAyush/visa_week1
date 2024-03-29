package com.visa.prj.entity;

public abstract class Product implements Comparable<Product> { //abstract to push up the hierarchy, do not want this class to exist
	private int id;
	private String name;
	private double price;
	public Product() {
//		super() compiler would do it on its own
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
//	public boolean isExpensive() {
//		return false;
//	}
	public abstract boolean isExpensive (); //pure virtual function
	
	@Override
		public int compareTo(Product o) {
		return Double.compare(this.price, o.price);
//		return (int)(this.id-o.id);
		}
	@Override //Source-> generate toString
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

