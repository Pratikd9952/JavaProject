package com.pratik.StreamAPI.pp;

public class Product {
	
	int id;
	String name;
	String authername;
	int price;
	int qty;
	
	public Product(int id, String name, String authername, int price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.authername = authername;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", authername=" + authername + ", price=" + price + ", qty="
				+ qty + "]";
	}
	
	
	
	

}
