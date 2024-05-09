package com.ra.mini_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Book {
	private Integer id;
	private String name;
	private Double price;
	private Integer stock;
	private String author;
	private Integer totalPages;
	private Integer yearCreated;
	private Category category;
}
