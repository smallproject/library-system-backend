package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    private Author author;

    @BeforeEach
    void setUp() {
        author = new Author();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Should keep author id")
    void shouldKeepAuthorId() {
        // arrange
        author.setId(100L);

        // act
        Long authorId = author.getId();

        // assert
        assertEquals(100L, authorId);
    }

    @Test
    @DisplayName("Should keep author first name")
    void shouldKeepAuthorFirstName() {
        // arrange
        author.setFirstName("Vincent");

        // act
        String firstName = author.getFirstName();

        // assert
        assertEquals("Vincent", firstName);
    }

    @Test
    @DisplayName("Should keep author middle name")
    void shouldKeepAuthorMiddleName() {
        // arrange
        author.setMiddleName("van");

        // act
        String middleName = author.getMiddleName();

        // assert
        assertEquals("van", middleName);
    }

    @Test
    @DisplayName("Should keep author last name")
    void shouldKeepAuthorLastName() {
        // arrange
        author.setLastName("Gogh");

        // act
        String lastName = author.getLastName();

        // assert
        assertEquals("Gogh", lastName);
    }

    @Test
    @DisplayName("Should keep author date of birth")
    void shouldKeepAuthorDateOfBirth() {
        // arrange
        author.setDateOfBirth(new Date(1853, 03, 30));

        // act
        Date dateOfBirth = author.getDateOfBirth();

        // assert
        assertEquals(new Date(1853,03,30), dateOfBirth);
    }

    @Test
    @DisplayName("Should keep author nationality")
    void shouldKeepAuthorNationality() {
        // arrange
        author.setNationality("Dutch");

        // act
        String nationality = author.getNationality();

        // assert
        assertEquals("Dutch", nationality);
    }

    @Test
    @DisplayName("Should keep author date of death")
    void shouldKeepAuthorDateOfDeath() {
        // arrange
        author.setDateOfDeath(new Date(1890,07,29));

        // act
        Date dateOfDeath = author.getDateOfDeath();

        // assert
        assertEquals(new Date(1890,07,29), dateOfDeath);
    }

    @Test
    @DisplayName("Should keep author bio")
    void shouldKeepAuthorBio() {
        // arrange
        author.setBio("Vincent Willem van Gogh was een Nederlands kunstschilder. Zijn werk valt onder het postimpressionisme, een kunststroming die het negentiende-eeuwse impressionisme opvolgde.");

        // act
        String bio = author.getBio();

        // assert
        assertEquals("Vincent Willem van Gogh was een Nederlands kunstschilder. Zijn werk valt onder het postimpressionisme, een kunststroming die het negentiende-eeuwse impressionisme opvolgde.", bio);
    }

    @Test
    @DisplayName("Should keep author website")
    void shouldKeepAuthorWebsite() {
        // arrange
        author.setWebsite("www.vincentvangogh.nl");

        // act
        String website = author.getWebsite();

        // assert
        assertEquals("www.vincentvangogh.nl", website);
    }

    @Test
    @DisplayName("Should keep author email")
    void shouldKeepAuthorEmail() {
        // arrange
        author.setEmail("vincent.van.gogh@netherlands.nl");

        // act
        String email = author.getEmail();

        // assert
        assertEquals("vincent.van.gogh@netherlands.nl", email);
    }

    @Test
    @DisplayName("Should keep author awards")
    void shouldKeepAuthorAwards() {
        // arrange
        author.setAwards("The Vincent van Gogh Biennal Award for Contemporary Art in Europe");

        // act
        String awards = author.getAwards();

        // assert
        assertEquals("The Vincent van Gogh Biennal Award for Contemporary Art in Europe", awards);
    }

    @Test
    @DisplayName("Should keep author active years")
    void shouldKeepAuthorActiveYears() {
        // arrange
        author.setActiveYears("1878 – 1890");

        // act
        String activeYears = author.getActiveYears();

        // assert
        assertEquals("1878 – 1890", activeYears);
    }

    @Test
    @DisplayName("Should keep author profile picture url")
    void shouldKeepAuthorProfilePictureUrl() {
        // arrange
        author.setProfilePictureUrl("www.vincentvangogh.nl/profilepicture");

        // act
        String profilePictureUrl = author.getProfilePictureUrl();

        // assert
        assertEquals("www.vincentvangogh.nl/profilepicture", profilePictureUrl);
    }

    @Test
    @DisplayName("Should correctly set and get books")
    void shouldSetAndGetBooks() {
        // arrange
        Author author = new Author();
        Book book1 = new Book();
        book1.setTitle("Book One");
        Book book2 = new Book();
        book2.setTitle("Book Two");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // act
        author.setBooks(books);
        List<Book> retrievedBooks = author.getBooks();

        // assert
        assertEquals(2, retrievedBooks.size());
        assertEquals("Book One", retrievedBooks.get(0).getTitle());
        assertEquals("Book Two", retrievedBooks.get(1).getTitle());
    }
}
