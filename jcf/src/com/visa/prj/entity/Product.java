package com.visa.prj.entity;

import com.visa.prj.annotation.Column;
import com.visa.prj.annotation.Table;

//@Table(name = "products")
public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	private String category;
	private int count;

	@Override // interface has one method
	public int compareTo(Product o) {
		return this.id - o.id; // any other comparison should be client headache
	}

	public Product() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", count="
				+ count + "]";
	}

	public Product(int id, String name, double price, String category, int count) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.count = count;
	}

	@Column(name = "prod_id", type = "NUMERIC(12)")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "prod_name")
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
