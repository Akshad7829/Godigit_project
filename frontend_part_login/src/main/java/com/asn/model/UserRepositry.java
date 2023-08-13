package com.asn.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<UserDetailEntity, Integer> {

	Optional<UserDetailEntity> findByEmail(String email);

}
