package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Should keep book id")
    void shouldKeepBookId() {
        // arrange
        book.setId(1L);

        // act
        Long bookId = book.getId();

        // assert
        assertEquals(1L, bookId);
    }

    @Test
    @DisplayName("Should keep book isbn")
    void shouldKeepBookISBN() {
        // arrange
        book.setIsbn("9780811850995");

        // act
        String isbn = book.getIsbn();

        // assert
        assertEquals("9780811850995", isbn);
    }

    @Test
    @DisplayName("Should keep book title")
    void shouldKeepBookTitle() {
        // arrange
        book.setTitle("Vincents Colors");

        // act
        String title = book.getTitle();

        // assert
        assertEquals("Vincents Colors", title);
    }

    @Test
    @DisplayName("Should keep book publication date")
    void shouldKeepBookPublicationDate() {
        // arrange
        book.setPublicationDate(new Date(2005,9,29));

        // act
        Date publicationDate = book.getPublicationDate();

        // assert
        assertEquals(new Date(2005,9,29), publicationDate);
    }

    @Test
    @DisplayName("Should keep book genre")
    void shouldKeepBookGenre() {
        // arrange
        book.setGenre("Art and children's literature");

        // act
        String genre = book.getGenre();

        // assert
        assertEquals("Art and children's literature", genre);
    }

    @Test
    @DisplayName("Should keep book page count")
    void shouldKeepBookPageCount() {
        // arrange
        book.setPageCount(48);

        // act
        int pageCount = book.getPageCount();

        // assert
        assertEquals(48, pageCount);
    }

    @Test
    @DisplayName("Should keep book language")
    void shouldKeepBookLanguage() {
        // arrange
        book.setLanguage("English");

        // act
        String language = book.getLanguage();

        // assert
        assertEquals("English", language);
    }

    @Test
    @DisplayName("Should keep book cover image url")
    void shouldKeepBookCoverImageUrl() {
        // arrange
        book.setCoverImageUrl("www.vincentvangogh.nl/coverimage.png");

        // act
        String coverImageUrl = book.getCoverImageUrl();

        // assert
        assertEquals("www.vincentvangogh.nl/coverimage.png", coverImageUrl);
    }

    @Test
    @DisplayName("Should keep book description summary")
    void shouldKeepBookDescriptionSummary() {
        // arrange
        book.setDescriptionSummary("Vincent van Gogh is one of the world's most famous artists. Throughout his life, he wrote to his younger brother, Theo, about his colorful, dynamic paintings. This book pairs the artist's paintings with his own words.\n" +
                "Van Gogh's descriptions, arranged as a simple rhyme, introduce young readers to all the colors of the rainbowand beyond. The descriptive words combine with spectacular reproductions of many of the artist's most beloved and important works to create a perfect art book for young and old alike.");


        // act
        String descriptionSummary = book.getDescriptionSummary();

        // assert
        assertEquals("Vincent van Gogh is one of the world's most famous artists. Throughout his life, he wrote to his younger brother, Theo, about his colorful, dynamic paintings. This book pairs the artist's paintings with his own words.\n" +
                "Van Gogh's descriptions, arranged as a simple rhyme, introduce young readers to all the colors of the rainbowand beyond. The descriptive words combine with spectacular reproductions of many of the artist's most beloved and important works to create a perfect art book for young and old alike.", descriptionSummary);
    }

    @Test
    @DisplayName("Should keep book rating")
    void shouldKeepBookRating() {
        // arrange
        book.setRating(4.7);

        // act
        double rating = book.getRating();

        // assert
        assertEquals(4.7, rating);
    }

    @Test
    @DisplayName("Should keep book copies available")
    void shouldKeepBookCopiesAvailable() {
        // arrange
        book.setCopiesAvailable(20);

        // act
        int copiesAvailable = book.getCopiesAvailable();

        // assert
        assertEquals(20, copiesAvailable);
    }

    @Test
    @DisplayName("Should keep book date added")
    void shouldKeepBookDateAdded() {
        // arrange
        book.setDateAdded(new Date(2024, 10,24));

        // act
        Date dateAdded = book.getDateAdded();

        // assert
        assertEquals(new Date(2024,10,24), dateAdded);
    }

    @Test
    @DisplayName("Should keep book status")
    void shouldKeepBookStatus() {
        // arrange
        book.setStatus("available");

        // act
        String status = book.getStatus();

        // assert
        assertEquals("available", status);
    }
}
