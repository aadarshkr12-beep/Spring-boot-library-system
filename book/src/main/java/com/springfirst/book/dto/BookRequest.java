package com.springfirst.book.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class BookRequest {
    @NotBlank private String title;
    private String author;
    private String genre;

    @Min(1)
    private int totalCopies;      
}
