package nl.smallproject.www.librarysystembackend.models;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Should keep author id")
    void shouldKeepAuthorId() {
        // arrange
        Author author = new Author();
        author.setId(100L);

        // act
        Long id = author.getId();

        // assert
        assertEquals(100L, id);
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

    @Test
    @DisplayName("Should keep author last name")
    void shouldKeepAuthorLastName() {
        // arrange
        Author author = new Author();
        author.setLastName("Gogh");

        // act
        String str = author.getLastName();

        // assert
        assertEquals("Gogh", str);
    }

    @Test
    @DisplayName("Should keep author date of birth")
    void shouldKeepAuthorDateOfBirth() {
        // arrange
        Author author = new Author();
        author.setDateOfBirth(new Date(1853, 03, 30));

        // act
        Date date = author.getDateOfBirth();

        // assert
        assertEquals(new Date(1853,03,30), date);
    }

    @Test
    @DisplayName("Should keep author nationality")
    void shouldKeepAuthorNationality() {
        // arrange
        Author author = new Author();
        author.setNationality("Dutch");

        // act
        String str = author.getNationality();

        // assert
        assertEquals("Dutch", str);
    }

    @Test
    @DisplayName("Should keep author date of death")
    void shouldKeepAuthorDateOfDeath() {
        // arrange
        Author author = new Author();
        author.setDateOfDeath(new Date(1890,07,29));

        // act
        Date date = author.getDateOfDeath();

        // assert
        assertEquals(new Date(1890,07,29), date);
    }

    @Test
    @DisplayName("Should keep author bio")
    void shouldKeepAuthorBio() {
        // arrange
        Author author = new Author();
        author.setBio("Vincent Willem van Gogh was een Nederlands kunstschilder. Zijn werk valt onder het postimpressionisme, een kunststroming die het negentiende-eeuwse impressionisme opvolgde.");

        // act
        String str = author.getBio();

        // assert
        assertEquals("Vincent Willem van Gogh was een Nederlands kunstschilder. Zijn werk valt onder het postimpressionisme, een kunststroming die het negentiende-eeuwse impressionisme opvolgde.", str);
    }

    @Test
    @DisplayName("Should keep author website")
    void shouldKeepAuthorWebsite() {
        // arrange
        Author author = new Author();
        author.setWebsite("www.vincentvangogh.nl");

        // act
        String str = author.getWebsite();

        // assert
        assertEquals("www.vincentvangogh.nl", str);
    }

    @Test
    @DisplayName("Should keep author email")
    void shouldKeepAuthorEmail() {
        // arrange
        Author author = new Author();
        author.setEmail("vincent.van.gogh@netherlands.nl");

        // act
        String str = author.getEmail();

        // assert
        assertEquals("vincent.van.gogh@netherlands.nl", str);
    }

    @Test
    @DisplayName("Should keep author awards")
    void shouldKeepAuthorAwards() {
        // arrange
        Author author = new Author();
        author.setAwards("The Vincent van Gogh Biennal Award for Contemporary Art in Europe");

        // act
        String str = author.getAwards();

        // assert
        assertEquals("The Vincent van Gogh Biennal Award for Contemporary Art in Europe", str);
    }

    @Test
    @DisplayName("Should keep author active years")
    void shouldKeepAuthorActiveYears() {
        // arrange
        Author author = new Author();
        author.setActiveYears("1878 – 1890");

        // act
        String str = author.getActiveYears();

        // assert
        assertEquals("1878 – 1890", str);
    }

    @Test
    @DisplayName("Should keep author profile picture url")
    void shouldKeepAuthorProfilePictureUrl() {
        // arrange
        Author author = new Author();
        author.setProfilePictureUrl("www.vincentvangogh.nl/profilepicture");

        // act
        String str = author.getProfilePictureUrl();

        // assert
        assertEquals("www.vincentvangogh.nl/profilepicture", str);
    }
}
