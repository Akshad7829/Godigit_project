package com.asn.service;

import java.util.List;

import com.asn.model.DeleteBook;
import com.asn.model.UserAllDetails;
import com.asn.model.BookDetail;

public abstract class bookServiceAddapter implements bookServiceInter{

	@Override
	public String addbook(BookDetail bookdetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String deletebooks(DeleteBook deleteBook) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<BookDetail> getallbooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<BookDetail> searchbook(String bookcategory) {
	    // TODO Auto-generated method stub
	    return null;
	
}
	
	@Override
	public List<UserAllDetails> getuser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BookDetail issuebook(Integer book_id,Integer user_id) {
		return null;
		
	}
	@Override

    public List<UserAllDetails> getallUser(){

        

        return null;

    }
}
