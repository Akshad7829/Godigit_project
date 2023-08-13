package com.asn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bookdetails")

public class BookEntity {
	
	@Id
	
	private Integer book_id;

	private String bookname;

	private byte[] bookimage;

	private String bookauthor;

	private Integer bookedition;


	private String bookcategory;

	private Integer bookcnt;

}
