package com.mono.lesson1;

import com.mono.lesson1.config.ApplicationConfig1;
import com.mono.lesson1.config.ApplicationConfig2;
import com.mono.lesson1.config.ApplicationConfig3;
import com.mono.lesson1.domain.Book;
import com.mono.lesson1.service.BookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
// @SpringBootApplication 키면 스프링부트에서 쓰는 라이브러리를 모두 불러온다.
// @SpringBootApplication 끄면 내가 설정한 것들만 불러온다.
public class LessonApplication {
    public static void main(String[] args) {

        // component scan
        /* xml을 사용함
        ApplicationContext context = new ClassPathXmlApplicationContext( "application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=============== Bean names ===============");
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean( "bookService", BookService.class );
        System.out.println(bookService.getClass());
         */


        /* xml 대신 자바 설정 파일 사용
        // java class + bean method
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig1.class);

        System.out.println("=============== Bean names ===============");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean( "bookService", BookService.class );
        */


        /* java class
        // Scan을 시작하는 패키지를 지정하는 방법
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig2.class);

        System.out.println("=============== Bean names ===============");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean( "bookService");
        */


        /* java class
        // Application Config + Component Scan (위에 방법보다 type safe 하다)
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig3.class);

        System.out.println("=============== Bean names ===============");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean( "bookService");
         */


        // case5. springBoot component scan
        // 어차피 스프링부트에 컴포넌트 스캔이 들어있어서 가능
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonApplication.class);

        System.out.println("=============== Bean names ===============");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean( "bookService");


    }
}
