package com.model.p1;

public class Product {
	int id;
	String name;
	String type;
	double price;
	
	public Product() {
	}
	
	public Product(int id, String name, String type, double price) {
		this.id=id;
		this.name=name;
		this.type=type;
		this.price=price;
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

	public double setPrice(double price) {
		return this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + name + ", type=" + type + ", price=" + price + "]";
	}
	

}
