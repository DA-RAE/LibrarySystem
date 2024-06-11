package com.capstone.librarysystem.book.service;

import com.capstone.librarysystem.book.dto.BestBookDto;
import com.capstone.librarysystem.book.entity.BookInfo;
import com.capstone.librarysystem.book.mapper.BookMapper;
import com.capstone.librarysystem.book.repository.BookInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestBookService {
    private BookInfoRepository bookInfoRepository;

    public List<BestBookDto> getBestBookFromDB() {
        List<BookInfo> bookInfo = bookInfoRepository.findByOrderByLoanCntDesc();
        return BookMapper.INSTANCE.toBestBookDto(bookInfo);
    }
}
