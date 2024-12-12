package nl.smallproject.www.librarysystembackend.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;

import nl.smallproject.www.librarysystembackend.controllers.BooksController;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookInputDto;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@SpringBootTest
public class Test02 {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private BookService bookService;

    @InjectMocks
    private BooksController booksController;

    // Sample BookInputDto for creating a new book
    private BookInputDto bookInputDto;


    @BeforeEach
    public void setup() {

        Date date = new Date(2024, 12, 05);

        bookInputDto = new BookInputDto();
        bookInputDto.setIsbn("978-0-123456-47-41");
        bookInputDto.setTitle("The Alchemist");
        bookInputDto.setPublicationDate(date);
        bookInputDto.setGenre("Adventure");
        bookInputDto.setPageCount(208);
        bookInputDto.setLanguage("English");
        bookInputDto.setCoverImageUrl("https://example.com/alchemist.jpg");
        bookInputDto.setDescriptionSummary("A story about following your dreams.");
        bookInputDto.setRating(4.7);
        bookInputDto.setCopiesAvailable(3);
        bookInputDto.setDateAdded(date);
        bookInputDto.setStatus("Available");

        // Set up MockMvc for the controller
        mockMvc = MockMvcBuilders.standaloneSetup(booksController).build();
    }

    @Test
    public void testCreateBook() throws Exception {
        // Mock the BookService behavior
        Book mockBook = new Book();
        mockBook.setId(1L);
        mockBook.setIsbn(bookInputDto.getIsbn());
        mockBook.setTitle(bookInputDto.getTitle());
        mockBook.setPublicationDate(bookInputDto.getPublicationDate());
        mockBook.setGenre(bookInputDto.getGenre());
        mockBook.setPageCount(bookInputDto.getPageCount());
        mockBook.setLanguage(bookInputDto.getLanguage());
        mockBook.setCoverImageUrl(bookInputDto.getCoverImageUrl());
        mockBook.setDescriptionSummary(bookInputDto.getDescriptionSummary());
        mockBook.setRating(bookInputDto.getRating());
        mockBook.setCopiesAvailable(bookInputDto.getCopiesAvailable());
        mockBook.setDateAdded(bookInputDto.getDateAdded());
        mockBook.setStatus(bookInputDto.getStatus());

        when(bookService.createBook(bookInputDto)).thenReturn(mockBook); // Mock the service layer

        // Create a JSON string of the bookInputDto
        String createBookRequestJson = """
                {
                    "isbn": "978-0-123456-47-41",
                    "title": "The Alchemist",
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
        """; // Ensure the request JSON matches the expected DTO structure

        // Perform the POST request and verify the response
        ResultActions resultActions = mockMvc.perform(post("/api/v1/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(createBookRequestJson))
                .andExpect(status().isCreated()) // Expect HTTP 201 status
                .andExpect(jsonPath("$.id").value(1)) // Ensure that the book ID is returned
                .andExpect(jsonPath("$.title").value("The Alchemist")) // Ensure the title matches
                .andExpect(jsonPath("$.isbn").value("978-0-123456-47-41")) // Ensure the ISBN matches
                .andExpect(header().string("Location", "/api/v1/books/1")); // Ensure the Location header points to the correct URI
    }
}
