package com.books;

import java.util.List;

public interface BookDao {  
	
	List<Book>getAllBook();
	
	Book getBookByIsbn(int isbn);
	
	void saveBook(Book book);
	
	void deletBook(Book book);

	

	

}
