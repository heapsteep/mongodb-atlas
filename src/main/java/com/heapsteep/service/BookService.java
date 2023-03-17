package com.heapsteep.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heapsteep.model.Book;
import com.heapsteep.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public Book addBook(Book book) {
		book.setId(UUID.randomUUID().toString().split("-")[0]);
		return bookRepository.save(book);
	}
}
