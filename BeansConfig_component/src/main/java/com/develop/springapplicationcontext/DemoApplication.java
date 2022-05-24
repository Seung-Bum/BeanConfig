package com.develop.springapplicationcontext;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


//application.xml에 일일이 설정하는 대신 애노테이션을 scanning해서 빈을 등록하고 의존성 주입하도록 변경한 것이다.
public class DemoApplication {

    public static void main(String[] args) {

        // 스프링 컨테이너 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        // ApplicationContext에서 bookService 빈을 꺼내 bookRepository가
        // null이 아닌지 확인해봄으로써 의존성 주입이 제대로 됐는지 알 수 있다.
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository != null); // 기대값 true

    }
}

// [bookRepository, bookService, org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
// org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
// org.springframework.context.annotation.internalCommonAnnotationProcessor,
// org.springframework.context.event.internalEventListenerProcessor,
// org.springframework.context.event.internalEventListenerFactory]
//true
