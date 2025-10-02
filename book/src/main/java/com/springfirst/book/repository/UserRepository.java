package com.springfirst.book.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springfirst.book.entity.user;

public interface UserRepository extends JpaRepository<user,Long> {
    Optional<user> findByEmail(String email);
}
