package com.example.librarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.librarymanagement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // custom methods
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
}