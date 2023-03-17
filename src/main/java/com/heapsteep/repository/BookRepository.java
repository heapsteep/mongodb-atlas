package com.heapsteep.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.heapsteep.model.Book;

//public interface BookRepository extends MongoRepository<Book,String>{ //we can use CrudRepository as well.
public interface BookRepository extends CrudRepository<Book,String>{ 
}
