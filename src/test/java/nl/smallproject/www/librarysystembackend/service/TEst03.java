package nl.smallproject.www.librarysystembackend.service;

import nl.smallproject.www.librarysystembackend.mappers.BookMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TEst03 {

    @Mock
    BookRepository repository;

    @Mock
    BookMapper mapper;

    @InjectMocks // dit geeft aan dat we de mocks met @Mock hierin geladen kunnen worden.
    BookService service;

    @Test
    @DisplayName("Get Order")
    void getOrder() {
        // Arrange
        var title = "Television";
        var description = "Fantasy book";

        Book book = new Book();
        book.setTitle(title);
        book.setDescriptionSummary(description);
        book.setId(123L);
        when(repository.findById(anyLong())).thenReturn(Optional.of(book));
        // Act
        var bookDto = service.getBookById(123L);

        // Assert
        assertEquals(title, bookDto.getTitle());
        assertEquals(description, bookDto.getDescriptionSummary());
    }
}
