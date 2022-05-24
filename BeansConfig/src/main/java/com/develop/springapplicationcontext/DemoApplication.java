package com.develop.springapplicationcontext;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class DemoApplication {

    public static void main(String[] args) {

        // 스프링 컨테이너 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        // ApplicationContext에서 bookService 빈을 꺼내 bookRepository가
        // null이 아닌지 확인해봄으로써 의존성 주입이 제대로 됐는지 알 수 있다.
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository); // 기대값 true

    }
}

