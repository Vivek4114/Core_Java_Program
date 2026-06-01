package com.nit;

import java.util.Comparator;

public class Product  implements Comparator<Product>{
	
 private int pid;
 private String productName;
 private double price;
 
 
 public Product() {
	super();
	// TODO Auto-generated constructor stub
}
 public Product(int pid, String productName, double price) {
	super();
	this.pid = pid;
	this.productName = productName;
	this.price = price;
 }
 public int getPid() {
	return pid;
 }
 public void setPid(int pid) {
	this.pid = pid;
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
 @Override
 public String toString() {
	return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
 }
 
 @Override
 public int compare(Product o1, Product o2) {
	 
	 return Double.compare(o2.price, o1.price);
	 
 }
 
 
 

}
