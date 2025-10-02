package com.springfirst.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springfirst.book.entity.Transaction;
import com.springfirst.book.entity.Status;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserIdAndStatus(Long userId, Status status);
Optional<Transaction> findByUserIdAndBookIdAndStatus(Long userId, Long bookId, Status status);
}
