package nl.smallproject.www.librarysystembackend.service;

import nl.smallproject.www.librarysystembackend.mappers.BookMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Test {
//    @Autowired
    private BookMapper bookMapper;

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService bookService;

    @org.junit.jupiter.api.Test
    @DisplayName("Get Book")
    public void getBook() {
//        Arrange
        var isbn = "123";
        var title = "Title";
        var status = "Available";

        Book book = new Book();

        book.setId(123L);
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setStatus(status);

        when(bookRepository.findById(anyLong())).thenReturn(Optional.of(book));
//        BookMapper mockMapper = Mockito.mock(BookMapper.class);
//        when(mockMapper.bookEntityToOutputDto(any(Book.class))).thenReturn(mockedDto);
//        BookService bookService = new BookService(mockMapper);

//        Act
        var orderDto = bookService.getBookById(123L);

//        Assert
        assertEquals(isbn, orderDto.getIsbn());
        assertEquals(title, orderDto.getTitle());
        assertEquals(status, orderDto.getStatus());
    }

}
