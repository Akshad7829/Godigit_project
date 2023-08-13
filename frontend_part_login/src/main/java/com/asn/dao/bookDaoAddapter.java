package com.asn.dao;

import java.util.List;
import java.util.Optional;

import com.asn.model.BookEntity;
import com.asn.model.UserAllDetails;
import com.asn.model.UserDetailEntity;
import com.asn.model.BookDetail;
import com.asn.model.deletebookEntity;

public abstract class bookDaoAddapter implements bookDaoInter{

	@Override
	public String addbook(BookEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String deletebook(deletebookEntity deleteEntity) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<BookEntity> getallbooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	  public List<BookEntity> searchbook(String bookcategory) {
		return null;
		    // TODO Auto-generated method stub
	

}
	  @Override
	  public BookEntity issueBook(Integer book_id,Integer user_id) {
		return null;
			
		} 

	   @Override
	public List<UserDetailEntity> getallUser() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
	  
	  
	  
	  
	  
}
