package com.capstone.librarysystem.book.mapper;

import com.capstone.librarysystem.book.dto.BestBookDto;
import com.capstone.librarysystem.book.dto.NewBookDto;
import com.capstone.librarysystem.book.dto.SearchBookDto;
import com.capstone.librarysystem.book.entity.BookInfo;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    List<BestBookDto> toBestBookDto(List<BookInfo> bookInfo);

    List<NewBookDto> toNewBookDto(List<BookInfo> bookInfo);

    List<SearchBookDto> toSearchBookDto(List<BookInfo> bookInfo);
}
