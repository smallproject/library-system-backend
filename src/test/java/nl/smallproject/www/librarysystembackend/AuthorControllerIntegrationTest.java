package nl.smallproject.www.librarysystembackend;

import nl.smallproject.www.librarysystembackend.controllers.AuthorsController;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.services.AuthorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
@ActiveProfiles("test")
public class AuthorControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private AuthorService authorService;

    @InjectMocks
    private AuthorsController authorsController;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(authorsController).build();
    }

    @Test
    void testGetAllAuthors() throws Exception {
        //arrange
        AuthorOutputDto author1 = new AuthorOutputDto();
//        author1.setId(0L);
        author1.setFirstName("Author One");
        author1.setBio("Biography of Author One");

        AuthorOutputDto author2 = new AuthorOutputDto();
//        author1.setId(1L);
        author1.setFirstName("Author Two");
        author1.setBio("Biography of Author Two");

        List<AuthorOutputDto> authors = Arrays.asList(author1, author2);

        // act
        when(authorService.getAllAuthors()).thenReturn(authors);

        // assert
        // Perform the GET request and check the response
        mockMvc.perform(get("/api/v1/authors"))  // replace with your actual endpoint URL
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].firstName").value("Author One"))
                .andExpect(jsonPath("$[0].bio").value("Biography of Author One"))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].firstName").value("Author Two"))
                .andExpect(jsonPath("$[1].bio").value("Biography of Author Two"));

    }

}
