package com.develop.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository()); // 의존성은 직접 setter를 호출해서 주입해준다.
        return bookService;
    }
}
//        Java 설정 파일을 만들려면 @Configuration을 붙여주고 빈으로 등록할 객체를 리턴하는 메소드를 정의한다.
//        메소드명이 빈 id, 리턴 타입이 빈 타입, 리턴한 객체가 빈 레퍼런스가 된다.
//        의존성은 직접 setter를 호출해서 주입해준다.

