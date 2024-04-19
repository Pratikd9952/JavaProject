package com.pratik.Comparator;

public class Product {
	String name;
	int id;
	int qty;
	int price;
	String batchcode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBatchcode() {
		return batchcode;
	}
	public void setBatchcode(String batchcode) {
		this.batchcode = batchcode;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", id=" + id + ", qty=" + qty + ", price=" + price + ", batchcode=" + batchcode
//				+ "]";
//	}
	

}
