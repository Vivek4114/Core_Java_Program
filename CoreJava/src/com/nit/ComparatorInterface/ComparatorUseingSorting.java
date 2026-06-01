package com.nit.ComparatorInterface;
import java.util.Arrays;
import java.util.Comparator;
class Product{
	
	int productId;
	String productName;
	double productPrice;
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
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
	
}

class SortingUsingPrice implements Comparator<Product>{
	 
	public int compare(Product o1, Product o2) {
		return -Double.compare(o1.getProductPrice(), o2.getProductPrice());
	}
}


public class ComparatorUseingSorting  {

	public static void main(String[] args) {
		
		
		Product p1  = new Product(101, "Laptop", 55000);
        Product p2  = new Product(104, "Mobile", 25000);
        Product p3  = new Product(103, "Keyboard", 1200);
        Product p4  = new Product(106, "Mouse", 700);
        Product p5  = new Product(101, "Monitor", 9000);
        Product p6  = new Product(102, "SSD", 3500);
        Product p7  = new Product(107, "Charger", 800);
        Product p8  = new Product(109, "Arphones", 600);
        Product p9  = new Product(108, "amart Watch", 3000);
        Product p10 = new Product(110, "Printer", 15000);
        
        
        Product prd[] = { p1, p2,p3, p4, p5, p6, p7, p8,  p9, p10 };
        
        Comparator <Product> product = (o1, o2) -> o1.productId-o2.productId;
        
        Arrays.sort(prd,product);
        System.out.println("Sort using Product Id ");
        for(Product p : prd) {
        		System.out.println(p);
        }
        
        System.out.println();
        
        SortingUsingPrice s1 = new SortingUsingPrice();
        Arrays.sort(prd,s1);
        
        System.out.println("Sort using Product Price ");
        for(Product p : prd) {
        		System.out.println(p);
        }
        
        System.out.println();
        
        Comparator <Product> sortByName = (obj1, obj2) -> obj1.productName.compareTo(obj2.productName);
        Arrays.sort(prd,sortByName);
        
        sortByName.thenComparing((o1, o2)->o1.productId-o2.productId);
        
        System.out.println("Sort using Product Name ");
        for(Product p : prd) {
        		System.out.println(p);
        }
        
		
	}
	

}



 
