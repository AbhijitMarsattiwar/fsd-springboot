package com.fsd.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fsd.model.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {
	
    private TestEntityManager entityManager;
    @Autowired
    private BookRepository bookRepository;
    
    @Before
    public void setUp() {
    	entityManager = Mockito.mock(TestEntityManager.class);    	
    }
    
    @Test
    public void testFindByName() {
    	Book book = new Book();
    	book.setTitle("Dot Net Programming");
        entityManager.persist(book);
        Book bookSearched = bookRepository.searchBookByTitle("Dot Net Programming");
        assertEquals("Dot Net Programming", bookSearched.getTitle());
    }
}
