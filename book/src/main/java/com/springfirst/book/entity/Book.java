package com.springfirst.book.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Book {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(nullable = false)
private String title;


private String author;
private String genre;


@Column(nullable = false)
private int totalCopies;


@Column(nullable = false)
private int availableCopies;
}
