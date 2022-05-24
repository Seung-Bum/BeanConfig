package com.develop.springapplicationcontext;

// @Component를 확장한 몇가지 애노테이션이 더 있는데 그 중 @Service, @Repository가 있다.
// 그러한 @Component를 확장한 애노테이션을 사용해도 마찬가지로 빈으로 등록된다.
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public Book save(Book book) { return null ;}
    public Book find(Book book) { return null ;}
}
