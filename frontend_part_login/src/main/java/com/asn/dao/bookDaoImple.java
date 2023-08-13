package com.asn.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.asn.model.BookEntity;
import com.asn.model.BookRepositry;
import com.asn.model.UserAllDetails;
import com.asn.model.UserDetailEntity;
import com.asn.model.UserRepositry;
import com.asn.model.BookDetail;
import com.asn.model.deletebookEntity;
import com.asn.model.issuebookRepositry;
import com.asn.model.issuedbookEntity;

@Repository
public class bookDaoImple extends bookDaoAddapter {

	@Autowired
	private BookRepositry repo;
	@Autowired
	private UserRepositry urepo;

	@Autowired
	private issuebookRepositry issuebookrepo;

	@Override
	public String addbook(BookEntity entity) {
		try {
			repo.save(entity);
			return "data saved";
		} catch (Exception e) {
			return "boook not saved";
		}

	}

	@Override
	public String deletebook(deletebookEntity deleteEntity) {

		repo.deleteById(deleteEntity.getBook_id());
		return "Book Deleted";

	}

	@Override
	public List<BookEntity> getallbooks() {
		List<BookEntity> bookdata = repo.findAll();
		return bookdata;
	}

	public List<BookEntity> searchbook(String bookcategory) {
		List<BookEntity> listbookcategory = repo.findByBookcategory(bookcategory);
		return listbookcategory;
	}

	public String issueBook(issuedbookEntity issuedbookEntity, BookEntity entity) {

		System.out.println(issuedbookEntity.getBookcnt());
		if (issuedbookEntity.getBookcnt() > 0) {
			List<issuedbookEntity> list = issuebookrepo.findByBookid(issuedbookEntity.getBook_id(),
					issuedbookEntity.getEmail());
			System.out.println(list);
			System.out.println(list);
			if (list.size() > 0) {	
				return "Sorry Can't issue book, you have already issued it...";
			}

			else {
				System.out.println("here...");
				issuebookrepo.save(issuedbookEntity);
				Integer i = entity.getBookcnt();
				entity.setBookcnt(i - 1);
				System.out.println(entity.getBookcnt());
				repo.save(entity);

				return "  book Issued";
			}
		} else {
			return "Book is not Available for now...";
		}

	}

	public List<UserDetailEntity> userbyid(String email) {
		Optional<UserDetailEntity> user = urepo.findByEmail(email);
		UserDetailEntity d = user.get();
		List<UserDetailEntity> udetails = new ArrayList<>();
		udetails.add(d);
		return udetails;
	}

	public List<issuedbookEntity> showissuedbooks(String email) {
		List<issuedbookEntity> user = issuebookrepo.findByEmail(email);
		System.out.println(user);
		return user;
	}

	public String returnbook(String email, Integer book_id) {
		try {
			issuebookrepo.deletebyemail(email, book_id);
		} catch (Exception e) {

		}
		return "Book Returned ";
	}

	@Override

	public List<UserDetailEntity> getallUser()

	{

		List<UserDetailEntity> userdata = urepo.findAll();

		return userdata;

	}

}
