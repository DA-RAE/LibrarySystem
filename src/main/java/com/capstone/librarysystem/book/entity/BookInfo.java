package com.capstone.librarysystem.book.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor
@Getter
@Table(name = "BookInfo")
public class BookInfo {
    public BookInfo() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_ID")
    private int bookID;

    @Column(name = "BOOK_NM")
    private String bookName;

    @Column(name = "AUTHOR_NM")
    private String authorName;

    @Column(name = "BOOK_COMP")
    private String bookComp;

    @Column(name = "PUB_YEAR")
    private String pubYear;

    @Column(name = "BOOK_NUM")
    private int bookNum;

    @Column(name = "BOOK_SIZE")
    private int bookSize;

    @Column(name = "CHGU_GIHO")
    private String chguGiho;

    @Column(name = "BOOK_VOL")
    private int bookVol;

    @Column(name = "LOAN_VOL")
    private int loanVol;

    @Column(name = "BOOK_PIC", columnDefinition = "LONGBLOB")
    private byte[] bookPic;
}
