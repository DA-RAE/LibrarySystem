package com.capstone.librarysystem.book.repository;

import com.capstone.librarysystem.book.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo, Integer> {
    @Query("SELECT b FROM BookInfo b WHERE b.pubYear > :oneYearAgo ORDER BY b.pubYear DESC")
    List<BookInfo> findNewBook(@Param("oneYearAgo") Date oneYearAgo);

    List<BookInfo> findByOrderByLoanCntDesc();

    List<BookInfo> findByBookNameContainingAndAuthorNameContainingAndBookCompContaining(String bookName, String authorName, String bookComp);
}
