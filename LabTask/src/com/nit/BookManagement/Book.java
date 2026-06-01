package com.nit.BookManagement;

class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private String type;
	private int quantity;

	public Book(String bookTitle, String author, String isbn, String type, int quantity) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.type = type;
		this.quantity = quantity;
	}
	 
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", isbn=" + isbn + ", type=" + type
				+ ", quantity=" + quantity + "]";
	}

}