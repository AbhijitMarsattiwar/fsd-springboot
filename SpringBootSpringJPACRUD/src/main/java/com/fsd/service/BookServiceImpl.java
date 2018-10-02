package com.fsd.service;

import java.util.List;

import com.fsd.model.Book;
import com.fsd.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements IBookService{

	@Autowired
	BookRepository bookRepository;	
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public void addBook(Book book) throws Exception {
		bookRepository.save(book);
	}

	public void deleteBook(Book book) throws Exception {
		bookRepository.delete(book);
	}

	public Book searchBook(long bookId) throws Exception {
		return bookRepository.findById(bookId).get();
	}

	public List<Book> getAllBooks() throws Exception {
		return (List<Book>) bookRepository.findAll();
	}

	public Book searchBookByTitle(String title) throws Exception {
		return bookRepository.searchBookByTitle(title);
	}
}
