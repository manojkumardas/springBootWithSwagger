package com.mda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mda.model.Book;
import com.mda.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;
	
	public String saveBook(Book book) {
		repo.save(book);
		return "Book saved sucessfully.. with ID:"+book.getBookId();
	}
	
	public Book getBook(int bookId) {
		return repo.findOne(bookId);
	}
	
	public List<Book> removeBook(int bookid){
		repo.deleteById(bookid);
		return repo.findAll();
	}

}
