package com.asn.dao;

import java.util.List;
import java.util.Optional;

import com.asn.model.BookEntity;
import com.asn.model.UserAllDetails;
import com.asn.model.UserDetailEntity;
import com.asn.model.BookDetail;
import com.asn.model.deletebookEntity;

public interface bookDaoInter {
	
	public String addbook(BookEntity entity);
	public String deletebook(deletebookEntity deleteEntity);
	public List<BookEntity> getallbooks();
	public List<BookEntity> searchbook(String bookcategory);
	public BookEntity issueBook(Integer book_id,Integer user_id);

	public List<UserDetailEntity> getallUser();

}
