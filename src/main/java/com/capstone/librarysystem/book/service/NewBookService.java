package com.capstone.librarysystem.book.service;

import com.capstone.librarysystem.book.dto.NewBookDto;
import com.capstone.librarysystem.book.entity.BookInfo;
import com.capstone.librarysystem.book.mapper.BookMapper;
import com.capstone.librarysystem.book.repository.BookInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class NewBookService {
    private BookInfoRepository bookInfoRepository;

    public List<NewBookDto> getNewBookFromDB() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        calendar.add(Calendar.YEAR, -1);
        Date oneYearAgo = calendar.getTime();

        List<BookInfo> bookInfo = bookInfoRepository.findNewBook(oneYearAgo);
        return BookMapper.INSTANCE.toNewBookDto(bookInfo);
    }
}
