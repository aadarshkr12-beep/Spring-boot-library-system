package com.springfirst.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springfirst.book.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
    
}
