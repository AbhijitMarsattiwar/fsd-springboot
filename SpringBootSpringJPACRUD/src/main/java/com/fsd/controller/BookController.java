package com.fsd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fsd.model.Book;
import com.fsd.model.Subject;
import com.fsd.service.IBookService;
import com.fsd.service.ISubjectService;

@Controller
@RequestMapping(value="/book")
public class BookController {

    @Autowired
    private IBookService bookService;      
    
    @Autowired
    private ISubjectService subjectService;
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("bookForm") Book book)  throws Exception{
    	bookService.addBook(book);     
    	return new ModelAndView("redirect:/book/list");
    }
    
    
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public ModelAndView add()  throws Exception{
     ModelAndView model = new ModelAndView("form");
     
     Book book = new Book();
     model.addObject("bookForm", book);
     
     return model;
    }
    
    @RequestMapping(value="/searchBookById", method=RequestMethod.POST)
    public ModelAndView searchBookByTitle(@ModelAttribute("bookForm") Book book)  throws Exception{
    	Book bookSearched = bookService.searchBookByTitle(book.getTitle());
    	System.out.println("========bookSearched.getTitle()======"+bookSearched.getTitle());
    	System.out.println("========getSubtitle======"+bookSearched.getSubject().getSubtitle());
    	ModelAndView model = new ModelAndView("search_form");
    	model.addObject("bookSearched", bookSearched);
    	return model;
    }
    
    @RequestMapping(value="/searchBook", method=RequestMethod.GET)
    public ModelAndView searchBook()  throws Exception{
     ModelAndView model = new ModelAndView("search_form");
     
     Book book = new Book();
     model.addObject("bookForm", book);
     
     return model;
    }
    
    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteBook(@ModelAttribute("book") Book book,@PathVariable("id") long id) throws Exception
    {
    	book.setId(id);
        bookService.deleteBook(book);        
        return new ModelAndView("redirect:/book/list");
    }

    @RequestMapping(value = "/list")
    public ModelAndView listBooks(@ModelAttribute("book") Book book) throws Exception
    {                
        ModelAndView model = new ModelAndView("list");
        List<Book> bookList = bookService.getAllBooks();
        model.addObject("list", bookList);
        
        return model;
    }
    
    @RequestMapping(value = "/searchSubject")
    public ModelAndView searchSubject(@ModelAttribute("subject") Subject subject,@PathVariable("subjectId") long subjectId) throws Exception
    {                
        ModelAndView model = new ModelAndView("subject");
        Subject subject1 = subjectService.searchSubject(subjectId);
        model.addObject("subject", subject1);        
        return model;
    }
    
    @ModelAttribute("subjectList")
    public Map<String, String> getSubjectList() {
       Map<String, String> subjectList = new HashMap<String, String>();
       subjectList.put("1", "JAVA");
       subjectList.put("2", "DOT-NET");   	  	
    	
       return subjectList;
    }

}
