package nl.smallproject.www.librarysystembackend.service;

import nl.smallproject.www.librarysystembackend.dtos.Book.BookOutputDto;
import nl.smallproject.www.librarysystembackend.mappers.BookMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    BookRepository bookRepository;

    @Mock
    BookMapper bookMapper;

    @InjectMocks
    BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Get Book")
    void getBook() {
//        arrange
        var isbn = "12323-231-23-34";
        var title = "Test Title";
        var genre = "horror";

        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setGenre(genre);
        book.setId(1L);
        when(bookRepository.findById(anyLong())).thenReturn(Optional.of(book));

//        act
        var bookDto = bookService.getBookById(1L);

//        assert
        assertEquals(isbn, bookDto.getIsbn());
        assertEquals(title, bookDto.getTitle());
        assertEquals(genre, bookDto.getGenre());
    }

    @Test
    void testGetBookByIdSuccess() {
        // Arrange
        Long bookId = 1L;
        Book mockBook = new Book();
        mockBook.setId(bookId);
        mockBook.setTitle("Test Book");

        BookOutputDto mockOutputDto = new BookOutputDto();
        mockOutputDto.setId(bookId);
        mockOutputDto.setTitle("Test Book");

        when(bookRepository.findById(bookId)).thenReturn(Optional.of(mockBook));
        when(bookMapper.bookEntityToOutputDto(mockBook)).thenReturn(mockOutputDto);

        // Act
        BookOutputDto result = bookService.getBookById(bookId);

        // Assert
        assertNotNull(result);
        assertEquals(bookId, result.getId());
        assertEquals("Test Book", result.getTitle());
//        verify(bookRepository, times(1)).findById(bookId);
//        verify(bookMapper, times(1)).bookEntityToOutputDto(mockBook);
    }
}
