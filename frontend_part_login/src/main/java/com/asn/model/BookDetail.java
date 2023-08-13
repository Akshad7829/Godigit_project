package com.asn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetail {
	
	private Integer book_id;
	private String bookname;
	private byte[] bookimage;
	private String bookauthor;
	private Integer bookedition;
	private String bookcategory;
	private Integer bookcnt;

}
