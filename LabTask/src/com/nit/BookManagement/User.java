package com.nit.BookManagement;

import java.util.ArrayList;
import java.util.List;

class User {
	public static final String userName = "LocalUser";
	public static final String UserPassward = "Pass@123";

	private LiberaryManagement liberary;

	User(LiberaryManagement liberary) {
		this.liberary = liberary;
	}

	public Book searchBookByTitle(String title) {

		return liberary.searchBookByTitle(title);
	}

	public List<Book> searchByAuthor(String author) {
		return liberary.searchByAuthor(author);

	}

	public List<Book> searchByGenere(String genere) {

		return liberary.searchByGenere(genere);
	}

	public Book searchBookByIsbn(String isbn) {

		return liberary.searchBookByIsbn(isbn);
	}

	public void displayBookByTitle(String Title) {
		liberary.displayBookByTitle(Title);
	}

	public void displayAllBook() {
		liberary.displayAllBook();
	}

	public void borrowBook(String title, int qty) {
		Book book = searchBookByTitle(title);

		if (book != null) {
			System.out.println("Book is There in the List");
			System.out.print(book.getBookTitle());
			if (book.getQuantity() >= qty) {
				System.out.println("Book is Availble please Borrow Your Book..!");
				book.setQuantity(book.getQuantity() - qty);
			} else {
				System.out.println("Book is Not Availble in Sufficient Quantity..!");
			}

			// System.out.println("Returining the Book..!");
			// returnBook(book, qty);

		} else {
			System.out.println("Book is Not AVailble ..! ");
		}
	}

	public void returnBook(Book book, int qty) {

		int quantity = book.getQuantity();

		System.out.println(book.getBookTitle() + " Book current Stock Is : " + book.getQuantity());

		System.out.println(
				qty + " Book Are Return By the " + userName + " Availble Book is " + (book.getQuantity() + qty));
		book.setQuantity(book.getQuantity() + qty);
	}

}
