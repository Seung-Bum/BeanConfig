package com.develop.springapplicationcontext;

// @Component를 확장한 몇가지 애노테이션이 더 있는데 그 중 @Service, @Repository가 있다.
// 그러한 @Component를 확장한 애노테이션을 사용해도 마찬가지로 빈으로 등록된다.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

//    의존성 주입은 @Autowired 애노테이션을 사용한다.
    @Autowired
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}

