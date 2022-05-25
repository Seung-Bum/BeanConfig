package com.mono.lesson1.service;

import com.mono.lesson1.BookStatus;
import com.mono.lesson1.domain.Book;
import com.mono.lesson1.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(SpringExtension.class)
public class BookServiceTest {
    private BookRepository bookRepository;


    //BookRepository 를 구현하지 않고는 BookService 만을 테스트 할 수 없다.
    // 왜냐하면 BookRepository 의 save()가 null 을 리턴하기 때문에
    // 의존성문제 !
    // 의존성을 가진 BookService 를 단위테스트로 만들기 힘든 상황.
    @Test
    @DisplayName("Service: 구현 안 된 Repository 사용")
    public void save() {
        Book book = new Book();
        BookService bookService = new BookService(bookRepository);

        Book result = bookService.save(book);
        assertThat(book.getCreated()).isNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();
        assertThat(book).isEqualTo(result);
    }
}



