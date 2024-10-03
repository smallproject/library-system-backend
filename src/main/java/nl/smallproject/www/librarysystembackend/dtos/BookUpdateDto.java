package nl.smallproject.www.librarysystembackend.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class BookUpdateDto {

    @NotBlank(message = "{book.isbn.notblank}")
    @Size(min = 3, max = 255, message = "{author.isbn.size}")
    private String isbn;

    @NotBlank(message = "{book.lastname.notblank}")
    @Size(min = 3, max = 255, message = "{book.lastname.size}")
    private String name;

    @NotBlank(message = "{book.lastname.notblank}")
    @Size(min = 3, max = 255, message = "{book.lastname.size}")
    private String description;

    @NotBlank(message = "{book.website.notblank}")
    private Date publicationDate;

    public @NotBlank(message = "{book.isbn.notblank}") @Size(min = 3, max = 255, message = "{author.isbn.size}") String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotBlank(message = "{book.isbn.notblank}") @Size(min = 3, max = 255, message = "{author.isbn.size}") String isbn) {
        this.isbn = isbn;
    }

    public @NotBlank(message = "{book.lastname.notblank}") @Size(min = 3, max = 255, message = "{book.lastname.size}") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "{book.lastname.notblank}") @Size(min = 3, max = 255, message = "{book.lastname.size}") String name) {
        this.name = name;
    }

    public @NotBlank(message = "{book.lastname.notblank}") @Size(min = 3, max = 255, message = "{book.lastname.size}") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "{book.lastname.notblank}") @Size(min = 3, max = 255, message = "{book.lastname.size}") String description) {
        this.description = description;
    }

    public @NotBlank(message = "{book.website.notblank}") Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(@NotBlank(message = "{book.website.notblank}") Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
