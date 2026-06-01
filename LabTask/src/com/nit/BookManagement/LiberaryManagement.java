package com.nit.BookManagement;
import java.util.ArrayList;
import java.util.List;

public class LiberaryManagement {
	private List<Book> books ;
	 
	public LiberaryManagement() {
		super();
		books = new ArrayList<Book>();
	}

	public void addBook(Book b) {
		books.add(b);
		System.out.println("Book Added Successfully");
	}
	
	public Book searchBookByTitle(String title) {
		
		for(int i= 0; i<books.size(); i++) {
			if(books.get(i).getBookTitle().equals(title)) {
				 return books.get(i);
			}
		}
		return null;
		
	}
	
	public List<Book> searchByAuthor(String author) {
		List<Book> authorList = new ArrayList<Book>();
		for(int i= 0; i<books.size(); i++) {
			if(books.get(i).getAuthor().equals(author)) {
				 authorList.add(books.get(i));
				
			}
		}
		return authorList;
		
	}
	 
	public List<Book> searchByGenere(String genere) {
		List<Book> genereList = new ArrayList<Book>();
		for(int i= 0; i<books.size(); i++) {
			if(books.get(i).getType().equals(genere)) {
				genereList.add(books.get(i));
				
			}
		}
		return genereList;
		
	}
	
	
	public Book searchBookByIsbn(String isbn) {
		
		for(int i= 0; i<books.size(); i++) {
			if(books.get(i).getIsbn().equals(isbn)) {
				return books.get(i);
			}
		}
		return null;
		
	}
 
	public void updateBookByTitle(String oldTitle, String newTitle) {
		Book book1 = searchBookByTitle(oldTitle);
		
		if(book1 != null) {
		System.out.println(" Old Book Are : " +	book1.getBookTitle());
		book1.setBookTitle(newTitle);
		System.out.println("Book Updated New book is : " + book1.getBookTitle());
		
		}
		else {
			System.out.println("Book Not Found..! Please Try Another Book..");
		}
		 
	}
	
	public void updateBookByAuthor(String isbn, String Author) {
	 
		Book book = searchBookByIsbn(isbn);
		
		if(book != null) {
			System.out.println("Book Updated ");
			System.out.println(" Old Book Are Author is  : " +	book.getAuthor());
			book.setAuthor(Author);
			System.out.println("Book Updated New book is Autor is : " + book.getAuthor());
			
			}
			else {
				System.out.println("Book Not Found..! Please Try Another Book..");
			}
		 
	}
	public void updateBookByIsbn(String isbn, String newIsbn) {
		
		Book book = searchBookByIsbn(isbn);
		
		if(book != null) {
			System.out.println("Book Updated ");
			System.out.println(" Old Book Are isbn  is  : " +	book.getIsbn());
			book.setIsbn(newIsbn);
			System.out.println("Book Updated New book is Autor is : " + book.getIsbn());
			
		}
		else {
			System.out.println("Book Not Found..! Please Try Another Book..");
		}
		
	}
	public void updateBookByGenere(String isbn, String genere) {
		
		Book book = searchBookByIsbn(isbn);
		
		if(book != null) {
			System.out.println("Book Updated ");
			System.out.println(" Old Book Are isbn  is  : " +	book.getType());
			book.setType(genere);
			System.out.println("Book Updated New book is Autor is : " + book.getType());
			
		}
		else {
			System.out.println("Book Not Found..! Please Try Another Book..");
		}
		
	}
	public void updateBookByQty(String isbn, int qty) {
		
		Book book = searchBookByIsbn(isbn);
		
		if(book != null) {
			System.out.println("Book Updated ");
			System.out.println(" Old Book Are qty  is  : " +	book.getQuantity());
			book.setQuantity(qty);
			System.out.println("Book Updated New book is Autor is : " + book.getQuantity());
			
		}
		else {
			System.out.println("Book Not Found..! Please Try Another Book..");
		}
		
	}
	
	
	public boolean deleteBookByTitle(String title) {
		
		
		for(Book book : books) {
			if(book.getBookTitle().equals(title)) {
				books.remove(book);
				return true;
				
			}
		}
		return false;	
		
	}
	public boolean deleteBookByisbn(String isbn) {
		
		//return books.removeIf(b -> b.getIsbn().equals(isbn));
		
		
		for(Book book : books) {
			if(book.getIsbn().equals(isbn)) {
				books.remove(book);
				return true;
				
			}
		}
		return false;	
		 
		
	}
	public void displayBookByTitle(String Title) {
		for(Book bok: books) {
			if(bok.getBookTitle().equals(Title)) {
				System.out.println(bok);
			}
		}
	}
	
	public void displayAllBook() {
		if(books.isEmpty()) {
			System.out.println("No Books Available..!");
		}else {
			
			for(Book bok: books) { 
					System.out.println(bok);		 
			}
		}
	}
}
