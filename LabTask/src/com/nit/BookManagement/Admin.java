package com.nit.BookManagement;

import java.util.ArrayList;
import java.util.List;

class Admin {

	public static final String userName = "Vivek";
	public static final String pwd = "123";
	private LiberaryManagement liberary;

	public Admin(LiberaryManagement liberary) {
		super();
		this.liberary = liberary;
	}
 
	 Book b1  = new Book("Java", "James Gosling", "ISBN001", "Programming", 10);
     Book b2  = new Book("Advanced Java", "Kathy Sierra", "ISBN002", "Programming", 8);
     Book b3  = new Book("Python Guide", "Guido van Rossum", "ISBN003", "Programming", 12);
     Book b4  = new Book("Data Structures", "Mark Allen", "ISBN004", "Computer Science", 6);
     Book b5  = new Book("Operating Systems", "Abraham Silberschatz", "ISBN005", "Computer Science", 5);
     Book b6  = new Book("Database Systems", "C. J. Date", "ISBN006", "Database", 7);
     Book b7  = new Book("Web Development", "Tim Berners-Lee", "ISBN007", "Technology", 9);
     Book b8  = new Book("Artificial Intelligence", "Stuart Russell", "ISBN008", "AI", 4);
     Book b9  = new Book("Machine Learning", "Tom Mitchell", "ISBN009", "AI", 3);
     Book b10 = new Book("Cloud Computing", "Rajkumar Buyya", "ISBN010", "Cloud", 11);
     
    
	 

	public void addBook(Book b) {
		liberary.addBook(b);
		liberary.addBook(b1);
		liberary.addBook(b2);
		liberary.addBook(b3);
		liberary.addBook(b4);
		liberary.addBook(b5);
		liberary.addBook(b6);
		liberary.addBook(b7);
		liberary.addBook(b8);
		liberary.addBook(b9);
		liberary.addBook(b10);
		
	}

	public Book searchBookByTitle(String title) {

	return	liberary.searchBookByTitle(title);

	}
	
	public List<Book> searchByAuthor(String Author){
		return liberary.searchByAuthor(Author);
	}

	public Book searchBookByIsbn(String isbn) {

		return liberary.searchBookByIsbn(isbn);

	}
	
	public List<Book> searchByGenere(String genere){
		return liberary.searchByGenere(genere);
	}

	public void updateBookByTitle(String oldTitle, String newTitle) {
		liberary.updateBookByAuthor(oldTitle, newTitle);

	}

	public void updateBookByAuthor(String isbn, String Author) {

		liberary.updateBookByAuthor(isbn, Author);
	}

	public void updateBookByIsbn(String isbn, String newIsbn) {

		liberary.updateBookByIsbn(isbn, newIsbn);

	}

	public void updateBookByGenere(String isbn, String genere) {
		liberary.updateBookByGenere(isbn, genere);

	}

	public void updateBookByQty(String isbn, int qty) {

		liberary.updateBookByQty(isbn, qty);

	}

	public boolean deleteBookByTitle(String title) {
		
	return liberary.deleteBookByTitle(title);
		 
		
	}

	public boolean deleteBookByisbn(String isbn) {
		return liberary.deleteBookByisbn(isbn);

	}

	public void displayBookByTitle(String Title) {
		liberary.displayBookByTitle(Title);
	}

	public void displayAllBook() {
		liberary.displayAllBook();
	}
}

