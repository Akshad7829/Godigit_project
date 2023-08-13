package com.asn.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface issuebookRepositry extends JpaRepository<issuedbookEntity, Integer> {

	@Query(value = "select * from issuedbooktable where email=:email", nativeQuery = true)
	List<issuedbookEntity> findByEmail(String email);

	@Query(value = "select * from issuedbooktable where email=:email and book_id=:book_id", nativeQuery = true)
	List<issuedbookEntity> findByBookid(Integer book_id, String email);

	@Query(value = "delete from issuedbooktable where email=:email and book_id=:book_id", nativeQuery = true)

	void deletebyemail(String email, Integer book_id);

}
