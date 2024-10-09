package nl.smallproject.www.librarysystembackend.dtos.Book;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class BookInputDto {

    @NotBlank(message = "{book.isbn.notblank}")
    @Size(min = 3, max = 255, message = "{author.isbn.size}")
    private String isbn;

    @NotBlank(message = "{book.title.notblank}")
    @Size(min = 3, max = 255, message = "{book.title.size}")
    private String title;

    @NotBlank(message = "{book.publicationDate.notblank}")
    private Date publicationDate;

    @NotBlank(message = "{book.genre.notblank}")
    @Size(min = 3, max = 255, message = "{book.genre.size}")
    private String genre;

    @PositiveOrZero(message = "{book.pageCount.positiveornotzero}")
    @Column(name = "pagecount")
    private Integer pageCount;

    @NotBlank(message = "{book.language.notblank}")
    @Size(min = 3, max = 255, message = "{book.language.size}")
    private String language;

    @NotBlank(message = "{book.coverImageUrl.notblank}")
    @Size(min = 3, max = 255, message = "{book.coverImageUrl.size}")
    private String coverImageUrl;

    @NotBlank(message = "{book.descriptionSummary.notblank}")
    @Size(min = 3, max = 255, message = "{book.descriptionSummary.size}")
    private String descriptionSummary;

    @PositiveOrZero(message = "{book.rating.positiveornotzero}")
    private Double rating;

    @PositiveOrZero(message = "{television.price.positiveornotzero}")
    private Integer copiesAvailable;

    @NotBlank(message = "{book.dateAdded.notblank}")
    private Date dateAdded;

    @NotBlank(message = "{book.status.notblank}")
    @Size(min = 3, max = 255, message = "{book.status.size}")
    private String status;

    public @NotBlank(message = "{book.isbn.notblank}") @Size(min = 3, max = 255, message = "{author.isbn.size}") String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotBlank(message = "{book.isbn.notblank}") @Size(min = 3, max = 255, message = "{author.isbn.size}") String isbn) {
        this.isbn = isbn;
    }

    public @NotBlank(message = "{book.title.notblank}") @Size(min = 3, max = 255, message = "{book.title.size}") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "{book.title.notblank}") @Size(min = 3, max = 255, message = "{book.title.size}") String title) {
        this.title = title;
    }

    public @NotBlank(message = "{book.publicationDate.notblank}") Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(@NotBlank(message = "{book.publicationDate.notblank}") Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public @NotBlank(message = "{book.genre.notblank}") @Size(min = 3, max = 255, message = "{book.genre.size}") String getGenre() {
        return genre;
    }

    public void setGenre(@NotBlank(message = "{book.genre.notblank}") @Size(min = 3, max = 255, message = "{book.genre.size}") String genre) {
        this.genre = genre;
    }

    public @PositiveOrZero(message = "{book.pageCount.positiveornotzero}") Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(@PositiveOrZero(message = "{book.pageCount.positiveornotzero}") Integer pageCount) {
        this.pageCount = pageCount;
    }

    public @NotBlank(message = "{book.language.notblank}") @Size(min = 3, max = 255, message = "{book.language.size}") String getLanguage() {
        return language;
    }

    public void setLanguage(@NotBlank(message = "{book.language.notblank}") @Size(min = 3, max = 255, message = "{book.language.size}") String language) {
        this.language = language;
    }

    public @NotBlank(message = "{book.coverImageUrl.notblank}") @Size(min = 3, max = 255, message = "{book.coverImageUrl.size}") String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(@NotBlank(message = "{book.coverImageUrl.notblank}") @Size(min = 3, max = 255, message = "{book.coverImageUrl.size}") String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public @NotBlank(message = "{book.descriptionSummary.notblank}") @Size(min = 3, max = 255, message = "{book.descriptionSummary.size}") String getDescriptionSummary() {
        return descriptionSummary;
    }

    public void setDescriptionSummary(@NotBlank(message = "{book.descriptionSummary.notblank}") @Size(min = 3, max = 255, message = "{book.descriptionSummary.size}") String descriptionSummary) {
        this.descriptionSummary = descriptionSummary;
    }

    public @PositiveOrZero(message = "{book.rating.positiveornotzero}") Double getRating() {
        return rating;
    }

    public void setRating(@PositiveOrZero(message = "{book.rating.positiveornotzero}") Double rating) {
        this.rating = rating;
    }

    public @PositiveOrZero(message = "{television.price.positiveornotzero}") Integer getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(@PositiveOrZero(message = "{television.price.positiveornotzero}") Integer copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public @NotBlank(message = "{book.dateAdded.notblank}") Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(@NotBlank(message = "{book.dateAdded.notblank}") Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public @NotBlank(message = "{book.status.notblank}") @Size(min = 3, max = 255, message = "{book.status.size}") String getStatus() {
        return status;
    }

    public void setStatus(@NotBlank(message = "{book.status.notblank}") @Size(min = 3, max = 255, message = "{book.status.size}") String status) {
        this.status = status;
    }
}
