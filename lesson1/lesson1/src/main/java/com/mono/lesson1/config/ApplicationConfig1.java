package com.mono.lesson1.config;

import com.mono.lesson1.repository.BookRepository;
import com.mono.lesson1.service.BookService;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig1 {
    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }
}
