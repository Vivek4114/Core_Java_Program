package com.nit.AmazonBasedProject;

class Product1{
	int id;
	String name;
	String category;
	double price;
	double rating;
	
	 
	  Product1(int id, String name, String category, double price, double rating) {
		 
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.rating = rating;
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
	 
	public String getCategory() {
		return category;
	}
	 
	public void setCategory(String category) {
		this.category = category;
	}
	 
	public double getPrice() {
		return price;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
	 
	public double getRating() {
		return rating;
	}
	 
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", rating="
				+ rating + "]";
	}
}
