package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);

        // Adding two books
        bookService.addBook("Book 1");
        bookService.addBook("Book 2");

        // Printing the list of books
        System.out.println("List of books: " + bookService.getBooks());
    }
}