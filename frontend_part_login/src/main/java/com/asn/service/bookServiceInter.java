package com.asn.service;

import java.util.List;

import com.asn.model.DeleteBook;
import com.asn.model.UserAllDetails;
import com.asn.model.BookDetail;

public interface bookServiceInter {
	public String addbook(BookDetail bookdetails);
	
	public String deletebooks(DeleteBook deleteBook);
	
	public List<BookDetail> getallbooks();
	
	public List<BookDetail> searchbook(String bookcategory);
	
	public List<UserAllDetails> getuser();
	
	public BookDetail issuebook(Integer book_id,Integer user_id);


    public List<UserAllDetails> getallUser();
	
}
