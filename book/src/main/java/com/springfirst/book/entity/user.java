package com.springfirst.book.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class user {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(nullable = false)
private String name;


@Column(nullable = false, unique = true)
private String email;


@Column(nullable = false)
private String password;


@Enumerated(EnumType.STRING)
private Role role = Role.ROLE_USER;
}
