package com.example;

public class Book {
	
	private int isbn;
	private String bookName;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	

	public Book(int isbn, String bookName) {
		this.isbn = isbn;
		this.bookName = bookName;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b=new Book();
		b.setIsbn(4);
		b.setBookName("W3school");
		System.out.println(b.getIsbn()+" "+b.getBookName());

	}

}
