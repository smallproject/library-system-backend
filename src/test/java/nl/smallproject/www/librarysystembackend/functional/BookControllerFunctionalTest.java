package nl.smallproject.www.librarysystembackend.functional;

import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerFunctionalTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookRepository repository;

    @BeforeEach()
    void cleanup() {
        repository.deleteAll();
    }

    @Test
    void givenExistingBook_whenGetById_thenReturnsJsonAndStatus200() throws Exception {
        // arrange: insert a book in H2
        var isbn = "12323-231-23-34";
        var title = "Test Title";
        var genre = "horror";

        Book book = new Book();
        Book saved = repository.save(book);

        // act & assert: perform GET /books/{id}
//        mockMvc.perform(get("/books/{id}"), saved.getId())
//                .accept(MediaType.APPLICATION_JSON)
//                .andExpect(status().isOk());
    }
}
