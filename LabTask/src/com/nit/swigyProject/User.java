package com.nit.swigyProject;

public class User {
	private int userId;
	private String userName;
	private String Address;
	public User(int userId, String userName, String address) {
		 
		this.userId = userId;
		this.userName = userName;
		Address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Address=" + Address + "]";
	}
	
	
	
	

}
