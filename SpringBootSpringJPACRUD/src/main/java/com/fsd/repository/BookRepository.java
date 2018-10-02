package com.fsd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fsd.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	@Query("select book from Book book where book.title = ?1 ")
	public Book searchBookByTitle(String title);
}