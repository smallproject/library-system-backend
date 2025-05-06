package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class UserReviewTest {

    private UserReview userReview;
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
        book.setId(1L);
        book.setTitle("Sample Book Title");

        userReview = new UserReview();
        userReview.setId(1L);
        userReview.setUser(12345L);
        userReview.setBook(book);
        userReview.setRating(4.5);
        userReview.setReviewText("This is a great book. I really enjoyed it.");
        userReview.setReviewTitle("Amazing Read!");
        userReview.setReviewDate(new Date());
        userReview.setHelpfulCount(10);
        userReview.setFlagged(false);
        userReview.setFlaggedReason(null);
        userReview.setResponseCount(3);
        userReview.setUpdatedAt(new Date());
        userReview.setUserRecommendation(true);
        userReview.setReadStatus("Completed");
        userReview.setReadDate(new Date());
        userReview.setUserLocation("New York, USA");
        userReview.setSpoilerFlag(false);
        userReview.setResponseFromLibrarian("Thank you for your review.");
        userReview.setAnonymousReview(false);
    }

    @Test
    void testUserReviewInitialization() {
        assertNotNull(userReview);
        assertEquals(1L, userReview.getId());
        assertEquals(12345L, userReview.getUser());
        assertNotNull(userReview.getBook());
        assertEquals(1L, userReview.getBook().getId());
        assertEquals("Sample Book Title", userReview.getBook().getTitle());
        assertEquals(4.5, userReview.getRating());
        assertEquals("This is a great book. I really enjoyed it.", userReview.getReviewText());
        assertEquals("Amazing Read!", userReview.getReviewTitle());
        assertNotNull(userReview.getReviewDate());
        assertEquals(10, userReview.getHelpfulCount());
        assertFalse(userReview.getFlagged());
        assertNull(userReview.getFlaggedReason());
        assertEquals(3, userReview.getResponseCount());
        assertNotNull(userReview.getUpdatedAt());
        assertTrue(userReview.getUserRecommendation());
        assertEquals("Completed", userReview.getReadStatus());
        assertNotNull(userReview.getReadDate());
        assertEquals("New York, USA", userReview.getUserLocation());
        assertFalse(userReview.getSpoilerFlag());
        assertEquals("Thank you for your review.", userReview.getResponseFromLibrarian());
        assertFalse(userReview.getAnonymousReview());
    }

    @Test
    void testUpdateUserReview() {
        userReview.setRating(3.0);
        userReview.setReviewText("The book was average. Not as expected.");
        userReview.setHelpfulCount(15);
        userReview.setFlagged(true);
        userReview.setFlaggedReason("Inappropriate language");
        userReview.setResponseCount(5);

        assertEquals(3.0, userReview.getRating());
        assertEquals("The book was average. Not as expected.", userReview.getReviewText());
        assertEquals(15, userReview.getHelpfulCount());
        assertTrue(userReview.getFlagged());
        assertEquals("Inappropriate language", userReview.getFlaggedReason());
        assertEquals(5, userReview.getResponseCount());
    }

    @Test
    void testAssociationWithBook() {
        assertNotNull(userReview.getBook());
        assertEquals(1L, userReview.getBook().getId());
        assertEquals("Sample Book Title", userReview.getBook().getTitle());
    }

    @Test
    void testNullValues() {
        UserReview emptyUserReview = new UserReview();

        assertNull(emptyUserReview.getId());
        assertNull(emptyUserReview.getUser());
        assertNull(emptyUserReview.getBook());
        assertNull(emptyUserReview.getRating());
        assertNull(emptyUserReview.getReviewText());
        assertNull(emptyUserReview.getReviewTitle());
        assertNull(emptyUserReview.getReviewDate());
        assertNull(emptyUserReview.getHelpfulCount());
        assertNull(emptyUserReview.getFlagged());
        assertNull(emptyUserReview.getFlaggedReason());
        assertNull(emptyUserReview.getResponseCount());
        assertNull(emptyUserReview.getUpdatedAt());
        assertNull(emptyUserReview.getUserRecommendation());
        assertNull(emptyUserReview.getReadStatus());
        assertNull(emptyUserReview.getReadDate());
        assertNull(emptyUserReview.getUserLocation());
        assertNull(emptyUserReview.getSpoilerFlag());
        assertNull(emptyUserReview.getResponseFromLibrarian());
        assertNull(emptyUserReview.getAnonymousReview());
    }

}
