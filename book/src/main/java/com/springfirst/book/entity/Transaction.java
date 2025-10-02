package com.springfirst.book.entity;

import java.time.LocalDateTime;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Transaction {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne(fetch = FetchType.EAGER)
private user user;


@ManyToOne(fetch = FetchType.EAGER)
private Book book;


private LocalDateTime borrowDate;
private LocalDateTime returnDate;


@Enumerated(EnumType.STRING)
private Status status;
}
