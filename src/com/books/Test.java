package com.books;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDaoImpl b=new BookDaoImpl();
		System.out.println(b.getBookByIsbn(0));

	}

}
