package com.capstone.librarysystem.book.service;

import com.capstone.librarysystem.book.dto.SearchBookDto;
import com.capstone.librarysystem.book.dto.SearchBookRequestDto;
import com.capstone.librarysystem.book.entity.BookInfo;
import com.capstone.librarysystem.book.mapper.BookMapper;
import com.capstone.librarysystem.book.repository.BookInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchBookService {
    private BookInfoRepository bookInfoRepository;

    public List<SearchBookDto> getSearchBookFromDB(SearchBookRequestDto searchBookRequestDto) {
        List<BookInfo> bookInfo = bookInfoRepository.findByBookNameContainingAndAuthorNameContainingAndBookCompContaining(
                searchBookRequestDto.getBookName(),
                searchBookRequestDto.getAuthorName(),
                searchBookRequestDto.getBookComp());
        return BookMapper.INSTANCE.toSearchBookDto(bookInfo);
    }
}
