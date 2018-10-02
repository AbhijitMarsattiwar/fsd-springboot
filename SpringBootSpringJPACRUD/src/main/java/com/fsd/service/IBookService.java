package com.fsd.service;

import java.util.List;

import com.fsd.model.Book;

public interface IBookService {

public void addBook(Book book) throws Exception;
	
	public void deleteBook(Book book) throws Exception;
	
	public Book searchBook(long bookId) throws Exception;
	
	public List<Book> getAllBooks() throws Exception;
	
	public Book searchBookByTitle(String title) throws Exception;
}
