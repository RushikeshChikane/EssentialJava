package com.books;

public class Book {
	
	private int isbn;
	private String bookName;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int isbn,String bookName ) {
		this.isbn=isbn;
		this.bookName=bookName;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	

}
