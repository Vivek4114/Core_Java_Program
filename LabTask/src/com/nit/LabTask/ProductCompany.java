package com.nit.LabTask;

import java.util.Arrays;
import java.util.Comparator;
  class CompareByname implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName());
	}
	   
  }
class Product{
	int productId;
	 String productName;
	 double price;
	 double rating;
	 public Product(int productId, String productName, double price, double rating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	 }
	 public int getProductId() {
		 return productId;
	 }
	 public void setProductId(int productId) {
		 this.productId = productId;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
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
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", rating="
				+ rating + "]";
	 }
	 
	 
	
}

public class ProductCompany {
	public static void main(String[] args) {
		
		 Product p1 = new Product(101, "Laptop", 55000.00, 4.5);
	        Product p2 = new Product(102, "Smartphone", 22000.00, 4.2);
	        Product p3 = new Product(103, "Headphones", 1500.00, 4.0);
	        Product p4 = new Product(104, "Keyboard", 899.00, 3.8);
	        Product p5 = new Product(105, "Mouse", 499.00, 4.1);
	        Product p6 = new Product(106, "Smartwatch", 3500.00, 4.3);
	        Product p7 = new Product(107, "Monitor", 11000.00, 4.4);
	        Product p8 = new Product(108, "Printer", 7500.00, 3.9);
	        Product p9 = new Product(109, "Tablet", 18000.00, 4.2);
	        Product p10 = new Product(110, "Bluetooth Speaker", 2000.00, 4.6);
	        
	        Product prd[] = {p1, p2, p3, p4, p5, p6, p7, p8, p9,p10};
	        Arrays.sort(prd, new CompareByname());
	        
	        for(Product p: prd) {
	        	System.out.println(p);
	        }
	        
	        
	        System.out.println("Sort by Useing Product Name");
	        
	        

		
	}

}
