package com.Qualifier.Exception;

public class Product {
	private String id;
	private String name;
	private String type;
	private int count;
	private double price ;
	
	public Product(String id, String name, String type, int count, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.count = count;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
