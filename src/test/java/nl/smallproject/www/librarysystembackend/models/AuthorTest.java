package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Should keep author first name")
    void shouldKeepAuthorFirstName() {
        // arrange
        Author author = new Author();
        author.setFirstName("Vincent");

        // act
        String str = author.getFirstName();

        // assert
        assertEquals("Vincent", str);
    }

    @Test
    @DisplayName("Should keep author middle name")
    void shouldKeepAuthorMiddleName() {
        // arrange
        Author author = new Author();
        author.setMiddleName("van");

        // act
        String str = author.getMiddleName();

        // assert
        assertEquals("van", str);
    }
}
