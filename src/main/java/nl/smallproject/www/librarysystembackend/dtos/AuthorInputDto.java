package nl.smallproject.www.librarysystembackend.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class AuthorInputDto {

    @NotBlank(message = "{author.firstName.notblank}")
    @Size(min = 3, max = 255, message = "{author.firstName.size}")
    private String firstName;

    @NotBlank(message = "{author.middleName.notblank}")
    @Size(min = 3, max = 255, message = "{author.middleName.size}")
    private String middleName;

    @NotBlank(message = "{author.lastName.notblank}")
    @Size(min = 3, max = 255, message = "{author.lastName.size}")
    private String lastName;

    @NotNull(message = "{author.dateOfBirth.notblank}" )
    private Date dateOfBirth;

    @NotBlank(message = "{author.nationality.notblank}")
    @Size(min = 3, max = 255, message = "{author.nationality.size}")
    private String nationality;

    @NotNull(message = "{author.dateofdeath.notblank}" )
    private Date dateOfDeath;

    @NotBlank(message = "{author.bio.notblank}")
    @Size(min = 3, max = 255, message = "{author.bio.size}")
    private String bio;

    @NotBlank(message = "{author.website.notblank}")
    @Size(min = 3, max = 255, message = "{author.website.size}")
    private String website;

    @NotBlank(message = "{author.email.notblank}")
    @Email(message = "{author.email.email}")
    @Size(min = 3, max = 255, message = "{author.email.size}")
    private String email;

    @NotBlank(message = "{author.awards.notblank}")
    @Size(min = 3, max = 255, message = "{author.awards.size}")
    private String awards;

    @NotBlank(message = "{author.activeYears.notblank}")
    @Size(min = 3, max = 255, message = "{author.activeYears.size}")
    private String activeYears;

    @NotBlank(message = "{author.profilePictureUrl.notblank}")
    @Size(min = 3, max = 255, message = "{author.profilePictureUrl.size}")
    private String profilePictureUrl;

    public @NotBlank(message = "{author.firstName.notblank}") @Size(min = 3, max = 255, message = "{author.firstName.size}") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "{author.firstName.notblank}") @Size(min = 3, max = 255, message = "{author.firstName.size}") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "{author.middleName.notblank}") @Size(min = 3, max = 255, message = "{author.middleName.size}") String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(@NotBlank(message = "{author.middleName.notblank}") @Size(min = 3, max = 255, message = "{author.middleName.size}") String middleName) {
        this.middleName = middleName;
    }

    public @NotBlank(message = "{author.lastName.notblank}") @Size(min = 3, max = 255, message = "{author.lastName.size}") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "{author.lastName.notblank}") @Size(min = 3, max = 255, message = "{author.lastName.size}") String lastName) {
        this.lastName = lastName;
    }

    public @NotNull(message = "{author.dateOfBirth.notblank}") Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotNull(message = "{author.dateOfBirth.notblank}") Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotBlank(message = "{author.nationality.notblank}") @Size(min = 3, max = 255, message = "{author.nationality.size}") String getNationality() {
        return nationality;
    }

    public void setNationality(@NotBlank(message = "{author.nationality.notblank}") @Size(min = 3, max = 255, message = "{author.nationality.size}") String nationality) {
        this.nationality = nationality;
    }

    public @NotNull(message = "{author.dateofdeath.notblank}") Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(@NotNull(message = "{author.dateofdeath.notblank}") Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public @NotBlank(message = "{author.bio.notblank}") @Size(min = 3, max = 255, message = "{author.bio.size}") String getBio() {
        return bio;
    }

    public void setBio(@NotBlank(message = "{author.bio.notblank}") @Size(min = 3, max = 255, message = "{author.bio.size}") String bio) {
        this.bio = bio;
    }

    public @NotBlank(message = "{author.website.notblank}") @Size(min = 3, max = 255, message = "{author.website.size}") String getWebsite() {
        return website;
    }

    public void setWebsite(@NotBlank(message = "{author.website.notblank}") @Size(min = 3, max = 255, message = "{author.website.size}") String website) {
        this.website = website;
    }

    public @NotBlank(message = "{author.email.notblank}") @Email(message = "{author.email.email}") @Size(min = 3, max = 255, message = "{author.email.size}") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "{author.email.notblank}") @Email(message = "{author.email.email}") @Size(min = 3, max = 255, message = "{author.email.size}") String email) {
        this.email = email;
    }

    public @NotBlank(message = "{author.awards.notblank}") @Size(min = 3, max = 255, message = "{author.awards.size}") String getAwards() {
        return awards;
    }

    public void setAwards(@NotBlank(message = "{author.awards.notblank}") @Size(min = 3, max = 255, message = "{author.awards.size}") String awards) {
        this.awards = awards;
    }

    public @NotBlank(message = "{author.activeYears.notblank}") @Size(min = 3, max = 255, message = "{author.activeYears.size}") String getActiveYears() {
        return activeYears;
    }

    public void setActiveYears(@NotBlank(message = "{author.activeYears.notblank}") @Size(min = 3, max = 255, message = "{author.activeYears.size}") String activeYears) {
        this.activeYears = activeYears;
    }

    public @NotBlank(message = "{author.profilePictureUrl.notblank}") @Size(min = 3, max = 255, message = "{author.profilePictureUrl.size}") String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(@NotBlank(message = "{author.profilePictureUrl.notblank}") @Size(min = 3, max = 255, message = "{author.profilePictureUrl.size}") String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
}
