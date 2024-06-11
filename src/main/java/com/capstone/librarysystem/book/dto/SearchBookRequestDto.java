package com.capstone.librarysystem.book.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SearchBookRequestDto {
    @JsonProperty("bookName")
    private String bookName;

    @JsonProperty("authorName")
    private String authorName;

    @JsonProperty("bookComp")
    private String bookComp;
}
