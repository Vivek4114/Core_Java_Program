package com.nit.swigyProject;

public class Restaurant {
	private int restaurantId;
private 	String restaurantName;
	 private String cuisine;
	private double rating;
	public Restaurant(int restaurantId, String restaurantName, String cuisine, double rating) {
		 
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.cuisine = cuisine;
		this.rating = rating;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", cuisine="
				+ cuisine + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
	
	

}
