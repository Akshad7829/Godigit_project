package com.asn.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	Optional<StudentEntity> findByemail(String email);

}
