package com.capstone.librarysystem.book.controller;

import com.capstone.librarysystem.book.dto.BestBookDto;
import com.capstone.librarysystem.book.dto.NewBookDto;
import com.capstone.librarysystem.book.dto.SearchBookDto;
import com.capstone.librarysystem.book.dto.SearchBookRequestDto;
import com.capstone.librarysystem.book.service.BestBookService;
import com.capstone.librarysystem.book.service.NewBookService;
import com.capstone.librarysystem.book.service.SearchBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    private BestBookService bestBookService;
    private NewBookService newBookService;
    private SearchBookService searchBookService;

    @GetMapping("/bestbook")
    @ResponseBody
    public List<BestBookDto> getBestBook() {
        return bestBookService.getBestBookFromDB();
    }

    @GetMapping("/newbook")
    @ResponseBody
    public List<NewBookDto> getNewBook() {
        return newBookService.getNewBookFromDB();
    }

    @PostMapping("/searchbook")
    @ResponseBody
    public List<SearchBookDto> getSearchBook(@RequestBody SearchBookRequestDto searchBookRequestDto) {
        return searchBookService.getSearchBookFromDB(searchBookRequestDto);
    }
}
