package com.asn.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asn.dao.bookDaoImple;
import com.asn.model.DeleteBook;
import com.asn.model.UserAllDetails;
import com.asn.model.UserDetailEntity;
import com.asn.model.BookEntity;
import com.asn.model.BookDetail;
import com.asn.model.deletebookEntity;
import com.asn.model.issuedbookDto;
import com.asn.model.issuedbookDto1;
import com.asn.model.issuedbookEntity;

@Service
public class bookServiceimple extends bookServiceAddapter{
	
	@Autowired
	private bookDaoImple imple;
	
	@Override
	public String addbook(BookDetail bookdetails) {
		ModelMapper mapper = new ModelMapper();
		BookEntity bookentity= mapper.map(bookdetails, BookEntity.class);
		String data = imple.addbook(bookentity);
		return data;

		
	}

	public String deletebooks(DeleteBook deletebook) {
		ModelMapper mapper = new ModelMapper();
		deletebookEntity deleteentity= mapper.map(deletebook, deletebookEntity.class);
		String output = imple.deletebook(deleteentity);
		return output;
		
		
	}
	@Override
	public List<BookDetail> getallbooks() {
		ModelMapper modelMapper = new ModelMapper();
		List<BookEntity> list = imple.getallbooks();
		List<BookDetail> bookdatalist = modelMapper.map(list, new TypeToken<List<BookDetail>>() {}.getType()); 
		return bookdatalist;
	}
	
@Override
	public List<BookDetail> searchbook(String bookcategory) {
		// TODO Auto-generated method stub
	ModelMapper modelMapper = new ModelMapper();

	List<BookEntity> list = imple.searchbook(bookcategory);
	List<BookDetail> bookcategorylist = modelMapper.map(list, new TypeToken<List<BookDetail>>() {}.getType()); 
	return bookcategorylist;
	}

public String issuebook(issuedbookDto issuedto,BookDetail detail) {
	ModelMapper modelMapper = new ModelMapper();
	issuedbookEntity bookentity= modelMapper.map(issuedto, issuedbookEntity.class);
	BookEntity bookentity1= modelMapper.map(detail, BookEntity.class);
	String answer = imple.issueBook(bookentity,bookentity1);
	return answer;
//	BookDetail bookissue = modelMapper.map(data, BookDetail.class);
//	return bookissue;
	
	
}

public List<UserAllDetails> userbyid(String email) {
	ModelMapper modelMapper = new ModelMapper();
	List<UserDetailEntity> userlist = imple.userbyid(email);
	List<UserAllDetails> userslist = modelMapper.map(userlist, new TypeToken<List<UserAllDetails>>() {}.getType()); 
	return userslist;
}

public List<issuedbookDto1> showissuedbooks(String email) {
	ModelMapper modelMapper = new ModelMapper();
	List<issuedbookEntity> issuelist = imple.showissuedbooks(email);
	List<issuedbookDto1> issuedbooklist = modelMapper.map(issuelist, new TypeToken<List<issuedbookDto1>>() {}.getType()); 
	return issuedbooklist;
}

public String returnbook(String email, Integer book_id) {
		return imple.returnbook(email,book_id);
	
}

@Override

public List<UserAllDetails> getallUser()

{

    ModelMapper modelMapper = new ModelMapper();

    List<UserDetailEntity> list = imple.getallUser();

    List<UserAllDetails> userDetails = modelMapper.map(list,new TypeToken<List<UserAllDetails>>() {}.getType());

    return userDetails;

}


}
