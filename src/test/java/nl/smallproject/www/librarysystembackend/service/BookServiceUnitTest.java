package nl.smallproject.www.librarysystembackend.service;

import nl.smallproject.www.librarysystembackend.controllers.BooksController;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookUpdateDto;
import nl.smallproject.www.librarysystembackend.security.JwtService;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.is;

//public class BookServiceUnitTest {
@WebMvcTest(BooksController.class) // Use BookController for testing
@ActiveProfiles("test")
public class BookServiceUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private JwtService jwtService;

    @MockBean
    private BookService bookService;

    @Test
    @WithMockUser(username = "testuser", roles = "USER")
    void shouldCreateBook() throws Exception {
        // Arrange
        BookInputDto bookInputDto = new BookInputDto();
        bookInputDto.setTitle("Effective Java");
//        bookInputDto.setAuthor("Joshua Bloch");
        bookInputDto.setIsbn("9780134685991");

        BookOutputDto bookOutputDto = new BookOutputDto();
        bookOutputDto.setId(1L);
        bookOutputDto.setTitle("Effective Java");
//        bookOutputDto.setAuthor("Joshua Bloch");
        bookOutputDto.setIsbn("9780134685991");

//        Mockito.when(bookService.createBook(Mockito.any(BookInputDto.class))).thenReturn(bookOutputDto);

        // Act and Assert
        this.mockMvc
                .perform(MockMvcRequestBuilders.post("/books") // Endpoint for creating a book
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "title": "Effective Java",
                                    "author": "Joshua Bloch",
                                    "isbn": "9780134685991"
                                }
                                """))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.title", is("Effective Java")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.author", is("Joshua Bloch")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.isbn", is("9780134685991")));
    }

    @Test
    @WithMockUser(username = "testuser", roles = "ADMIN")
    void shouldUpdateBook() throws Exception {
        // Arrange
        BookUpdateDto bookUpdateDto = new BookUpdateDto();
        bookUpdateDto.setTitle("Effective Java (Updated)");
//        bookUpdateDto.setAuthor("Joshua Bloch");
        bookUpdateDto.setIsbn("9780134685991");

        Mockito.doNothing().when(bookService).updateBook(Mockito.eq(1L), Mockito.any(BookUpdateDto.class));

        // Act and Assert
        this.mockMvc
                .perform(MockMvcRequestBuilders.put("/api/v1/books/1") // Endpoint for updating a book
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "title": "Effective Java (Updated)",

                                    "isbn": "9780134685991"
                                }
                                """))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
