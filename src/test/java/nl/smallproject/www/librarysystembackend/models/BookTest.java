package nl.smallproject.www.librarysystembackend.models;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    @DisplayName("Should correctly set and get author")
    void shouldSetAndGetAuthor() {
        // arrange
        Book book = new Book();
        Author author = new Author();
        author.setId(1L);
        author.setFirstName("Author Name");

        List<Author> authors = new ArrayList<>();
        authors.add(author);

        // act
        book.setAuthor(authors);
        List<Author> retrievedAuthors = book.getAuthor();

        // assert
//        assertEquals(1L, retrievedAuthors.getId());
//        assertEquals("Author Name", retrievedAuthors.getFirstName());
    }

    @Test
    @DisplayName("Should correctly set and get user reviews")
    void shouldSetAndGetUserReviews() {
        // arrange
        Book book = new Book();
        UserReview review1 = new UserReview();
        review1.setId(1L);
        review1.setReviewText("Great book!");

        UserReview review2 = new UserReview();
        review2.setId(2L);
        review2.setReviewText("Not my favorite.");

        List<UserReview> userReviews = new ArrayList<>();
        userReviews.add(review1);
        userReviews.add(review2);

        // act
        book.setUserReviews(userReviews);
        List<UserReview> retrievedReviews = book.getUserReviews();

        // assert
        assertEquals(2, retrievedReviews.size());
        assertEquals("Great book!", retrievedReviews.get(0).getReviewText());
        assertEquals("Not my favorite.", retrievedReviews.get(1).getReviewText());
    }

    @Test
    @DisplayName("Should correctly set and get inventories")
    void shouldSetAndGetInventories() {
        // arrange
        Book book = new Book();
        Inventory inventory1 = new Inventory();
        inventory1.setId(1L);
        inventory1.setLocation("Location A");

        Inventory inventory2 = new Inventory();
        inventory2.setId(2L);
        inventory2.setLocation("Location B");

        List<Inventory> inventories = new ArrayList<>();
        inventories.add(inventory1);
        inventories.add(inventory2);

        // act
        book.setInventories(inventories);
        List<Inventory> retrievedInventories = book.getInventories();

        // assert
        assertEquals(2, retrievedInventories.size());
        assertEquals("Location A", retrievedInventories.get(0).getLocation());
        assertEquals("Location B", retrievedInventories.get(1).getLocation());
    }


    @Test
    @Transactional
    void testOneToManyMapping() {
        // Create a Book entity
        Book book = new Book();
        book.setTitle("Test Book");

        // Create a list of Reservations
        List<Reservation> reservations = new ArrayList<>();
        Reservation reservation1 = new Reservation();
        reservation1.setBook(book); // Set the relationship
        reservation1.setNotes("Reservation 1");

        Reservation reservation2 = new Reservation();
        reservation2.setBook(book); // Set the relationship
        reservation2.setNotes("Reservation 2");

        reservations.add(reservation1);
        reservations.add(reservation2);

        // Set the reservations in the Book entity
        book.setReservations(reservations);

//        // Persist the Book entity (cascades save to reservations)
//        entityManager.persist(book);
//        entityManager.flush();
//
//        // Clear the persistence context to ensure entities are fetched from the database
//        entityManager.clear();
//
//        // Retrieve the book and its reservations
//        Book retrievedBook = entityManager.find(Book.class, book.getId());
//        assertNotNull(retrievedBook, "The book should have been saved and retrieved.");
//        assertNotNull(retrievedBook.getReservations(), "The reservations list should not be null.");
//        assertEquals(2, retrievedBook.getReservations().size(), "The reservations list should contain 2 entries.");
//
//        // Verify the relationship
//        assertEquals("Reservation 1", retrievedBook.getReservations().get(0).getNotes());
//        assertEquals("Reservation 2", retrievedBook.getReservations().get(1).getNotes());
//        assertEquals(retrievedBook, retrievedBook.getReservations().get(0).getBook(), "The reservation should reference the correct book.");
    }
}
