package com.mono.lesson1.service;

import com.mono.lesson1.domain.Book;
import com.mono.lesson1.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class BookServiceTest {
//@Runwith(SpringRunner.class)
    @ExtendWith(SpringExtension.class)
    class BookServiceTest {
        BookRepository bookRepository;

        @Test
        @DisplayName("Service : 구현안된 Repository 사용")
        public void save() {
            Book book = new Book();
            // System.out.println(bookRepository.save(book));

            BookService bookService = new BookService(BookRepository);

            Book result = BookService.save(book);
            assertThat(book.getCreated()).isEqualTo()

        }
    }

}



