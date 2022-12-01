package com.books;
import java.util.ArrayList;
import java.util.List;


public class BookDaoImpl implements BookDao{ 
	
	 List<Book>books;
	
	public BookDaoImpl() {
		books = new ArrayList<>();
		books.add(new Book(1,"Java"));
		books.add(new Book(2,"Paython")); 
		books.add(new Book(3,"Android"));
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book getBookByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return books.get(isbn);
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	@Override
	public void deletBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book);
		
	}

    

	
	
	
	
	
	

	

	
	
	
	

}
