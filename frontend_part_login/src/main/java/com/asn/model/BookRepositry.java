package com.asn.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepositry extends JpaRepository<BookEntity, Integer> {

	List<BookEntity> findByBookcategory(String bookcategory);



}
