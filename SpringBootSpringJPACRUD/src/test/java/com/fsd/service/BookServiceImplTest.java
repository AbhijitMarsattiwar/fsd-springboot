package com.fsd.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.fsd.model.Book;
import com.fsd.repository.BookRepository;

public class BookServiceImplTest {

	private BookServiceImpl bookService;
    private BookRepository bookRepositoryMock; 
    
    @Before
    public void setUp() {
    	bookRepositoryMock = Mockito.mock(BookRepository.class);
    	bookService = new BookServiceImpl();
    	bookService.setBookRepository(bookRepositoryMock);
    }
    
    
    @Test
    public void addBookSuccessfuly() throws Exception {
        Book book = new Book();
        book.setId(111);
        book.setTitle("Spring Test");
        bookService.addBook(book);
    }
    
    @Test
    public void deleteBookSuccessfuly() throws Exception {
        Book book = new Book();
        book.setId(111);
        bookService.deleteBook(book);
    }    
        
    @Test
    public void searchBookByTitle() throws Exception {        
        bookService.searchBookByTitle("Spring Test");
    }
    
    /*@Test(expected = NullPointerException.class)
    public void addEmptyBook() throws Exception {
        bookService.addBook(new Book());
    }  */ 
    
}
