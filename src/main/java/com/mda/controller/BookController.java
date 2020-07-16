package com.mda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mda.model.Book;
import com.mda.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping
	@RequestMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping
	@RequestMapping("/searchbook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}
	
	@RequestMapping("/deletebook/{bookId}")
	public List<Book> removeBook(@PathVariable int bookId){
		
		return bookService.removeBook(bookId);
	}

}
