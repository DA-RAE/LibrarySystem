package com.capstone.librarysystem.book.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BestBookDto {
    @JsonProperty("bookID")
    private int bookID;

    @JsonProperty("bookName")
    private String bookName;

    @JsonProperty("authorName")
    private String authorName;

    @JsonProperty("bookComp")
    private String bookComp;

    @JsonProperty("pubYear")
    private String pubYear;

    @JsonProperty("bookNum")
    private int bookNum;

    @JsonProperty("bookSize")
    private int bookSize;

    @JsonProperty("chguGiho")
    private String chguGiho;

    @JsonProperty("bookVol")
    private int bookVol;

    @JsonProperty("loanVol")
    private int loanVol;

    @JsonProperty("bookPic")
    private byte[] bookPic;
}
