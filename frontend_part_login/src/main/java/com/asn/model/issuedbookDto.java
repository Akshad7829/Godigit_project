package com.asn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class issuedbookDto {

	private String email;
	private Integer book_id;
	private String bookname;
	private String bookauthor;
	private String bookcategory;
	private Integer bookcnt;


	

}
