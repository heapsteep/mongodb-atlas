package com.heapsteep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Book_collection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	private String id;
	private String bookName;
	private Double price;
	private String author;
	private String publication;

}
