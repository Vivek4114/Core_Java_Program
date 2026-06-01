package com.nit.Dec2;

import java.util.ArrayList;
  class FavoritesManager {
	private ArrayList<String> favorites = new ArrayList<String>();
	
	public void addBook(String item) {
		favorites.add(item);
	}
	
	public void removeItem(String item) {
		favorites.remove(item);
	}
	public void displayFavorites() {
		System.out.println(favorites);
	}
	
	
	public static void main(String[] args)  {
		FavoritesManager p1 = new FavoritesManager();
		p1.addBook("Incapsiton");
		p1.addBook("Avtar");
		p1.addBook("wings of Fire");
		
		p1.removeItem("Avtar");
		p1.displayFavorites();
		 

	}

}
