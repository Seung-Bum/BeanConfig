package com.mono.lesson1.service;

import com.mono.lesson1.BookStatus;
import com.mono.lesson1.domain.Book;
import com.mono.lesson1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    public BookService() {

    }

    public void setBookRepository(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    @PostConstruct
    public void postConstructor() {
        System.out.println("++++++++++++++++++++");
        System.out.println("BookService 초기화");
        System.out.println(bookRepository.getClass());
        System.out.println("++++++++++++++++++++");
    }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    /*

    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    public Book find(Book book) { return book; }

    public void setBookRepository(BookRepository bookRepository) { this.bookRepository = bookRepository; }

     */

}
