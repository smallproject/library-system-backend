package nl.smallproject.www.librarysystembackend.controller;

import nl.smallproject.www.librarysystembackend.controllers.BooksController;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookInputDto;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
//@WebMvcTest(BooksController.class)
public class BookControllerTest {
    @Autowired
    private MockMvc mockMvc;


//    @Mock
//    private BookMapper bookMapper;

    @Autowired
    private BookRepository bookRepository;
//    @Mock

//    @InjectMocks
//    private BookService bookService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }
//
//    @Test
//    void testCreateBook() throws Exception {
//        BookInputDto bookInputDto = new BookInputDto();
//        bookInputDto.setTitle("Title");
//        bookInputDto.setGenre("Horror");
//        Book mockBook = new Book();
//        mockBook.setTitle("Title");
//        mockBook.setGenre("Horror");
//
//        when(bookService.createBook(any(BookInputDto.class))).thenReturn(mockBook);
//
//
//    }

    @Test
    @DisplayName("create book")
    @WithMockUser(username = "user001", roles = {"ADMIN"})
    void testCreateBookSuccess() throws Exception {

//        String dateString = "1988-03-31T22:00:00.000+00:00";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
//        // Parse the string into Date
//        Date date = sdf.parse(dateString);
//
//        // Create a mock BookInputDto (DTO used for creating a new book)
//        BookInputDto bookInputDto = new BookInputDto();
//        bookInputDto.setIsbn("978-0-123456-47-41");
//        bookInputDto.setTitle("The Alchemist 4");
//        bookInputDto.setPublicationDate(date);
//        bookInputDto.setGenre("Adventure");
//        bookInputDto.setPageCount(208);
//        bookInputDto.setLanguage("English");
//        bookInputDto.setCoverImageUrl("https://example.com/alchemist.jpg");
//        bookInputDto.setDescriptionSummary("A story about following your dreams.");
//        bookInputDto.setRating(4.7);
//        bookInputDto.setCopiesAvailable(3);
//        bookInputDto.setDateAdded(date);
//        bookInputDto.setStatus("Available");
//
//        // Mock the BookService
//        Book mockBook = new Book();
//        mockBook.setId(1L);  // Set the ID as it's returned after creation
//        mockBook.setTitle("The Alchemist 4");
//        mockBook.setIsbn("978-0-123456-47-41");
//        mockBook.setGenre("Adventure");
//        mockBook.setPublicationDate(date);
//        mockBook.setPageCount(208);
//        mockBook.setLanguage("English");
//        mockBook.setCoverImageUrl("https://example.com/alchemist.jpg");
//        mockBook.setDescriptionSummary("A story about following your dreams.");
//        mockBook.setRating(4.7);
//        mockBook.setCopiesAvailable(3);
//        mockBook.setDateAdded(date);
//        mockBook.setStatus("Available");

//        when(bookService.createBook(any(BookInputDto.class))).thenReturn(mockBook); // Mock service layer

        String createBookRequestJson = """
                {
                    "isbn": "978-0-123456-47-41",
                    "title": "The Alchemist 4",
                    "publicationDate": "1988-03-31T22:00:00.000+00:00",
                    "genre": "Adventure",
                    "pageCount": 208,
                    "language": "English",
                    "coverImageUrl": "https://example.com/alchemist.jpg",
                    "descriptionSummary": "A story about following your dreams.",
                    "rating": 4.7,
                    "copiesAvailable": 3,
                    "dateAdded": "2023-01-14T23:00:00.000+00:00",
                    "status": "Available"
                }
                
                """;

        this.mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/books")
                .contentType(APPLICATION_JSON)
                .content(createBookRequestJson))
            .andDo(MockMvcResultHandlers.print());
//            .andExpect(MockMvcResultMatchers.status().isCreated())
//            .andExpect(MockMvcResultMatchers.jsonPath("$.id").isNotEmpty())
//            .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("The Alchemist 4"));
    }
}
