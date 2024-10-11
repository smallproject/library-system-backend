package nl.smallproject.www.librarysystembackend.dtos.Author;

import nl.smallproject.www.librarysystembackend.dtos.Book.BookOutputDto;

import java.util.Date;
import java.util.List;

public class AuthorOutputDto {
    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private Date dateOfBirth;

    private String nationality;

    private Date dateOfDeath;

    private String bio;

    private String website;

    private String email;

    private String awards;

    private String activeYears;

    private String profilePictureUrl;

    private List<BookOutputDto> bookOutputDtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getActiveYears() {
        return activeYears;
    }

    public void setActiveYears(String activeYears) {
        this.activeYears = activeYears;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public List<BookOutputDto> getBookOutputDtos() {
        return bookOutputDtos;
    }

    public void setBookOutputDtos(List<BookOutputDto> bookOutputDtos) {
        this.bookOutputDtos = bookOutputDtos;
    }
}
