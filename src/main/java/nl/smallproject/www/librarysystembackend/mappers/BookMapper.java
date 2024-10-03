package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.BookOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.BookUpdateDto;
import nl.smallproject.www.librarysystembackend.models.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookOutputDto bookEntityToOutputDto(Book book) {
        BookOutputDto bookOutputDto = new BookOutputDto();
        bookOutputDto.setId(book.getId());
        bookOutputDto.setIsbn(book.getIsbn());
        bookOutputDto.setTitle(book.getTitle());
        bookOutputDto.setPublicationDate(book.getPublicationDate());
        bookOutputDto.setGenre(book.getGenre());
        bookOutputDto.setPagecount(book.getPageCount());
        bookOutputDto.setLanguage(book.getLanguage());
        bookOutputDto.setCoverImageUrl(book.getCoverImageUrl());
        bookOutputDto.setDescriptionsummary(book.getDescriptionSummary());
        bookOutputDto.setRating(book.getRating());
        bookOutputDto.setCopiesAvailable(book.getCopiesAvailable());
        bookOutputDto.setDateAdded(book.getDateAdded());
        bookOutputDto.setStatus(book.getStatus());
        return bookOutputDto;
    }

    public Book bookInputDtoToEntity(BookInputDto bookInputDto) {
        Book book = new Book();
        book.setIsbn(bookInputDto.getIsbn());
        book.setTitle(bookInputDto.getTitle());
        book.setPublicationDate(bookInputDto.getPublicationDate());
        book.setGenre(bookInputDto.getGenre());
        book.setPageCount(bookInputDto.getPageCount());
        book.setLanguage(bookInputDto.getLanguage());
        book.setCoverImageUrl(bookInputDto.getCoverImageUrl());
        book.setDescriptionSummary(bookInputDto.getDescriptionSummary());
        book.setRating(bookInputDto.getRating());
        book.setCopiesAvailable(bookInputDto.getCopiesAvailable());
        book.setDateAdded(bookInputDto.getDateAdded());
        book.setStatus(bookInputDto.getStatus());
        return book;
    }

    public Book bookUpdateDtoToEntity(BookUpdateDto bookUpdateDto) {
        Book book = new Book();
        book.setIsbn(bookUpdateDto.getIsbn());
        book.setTitle(bookUpdateDto.getTitle());
        book.setPublicationDate(bookUpdateDto.getPublicationDate());
        book.setGenre(bookUpdateDto.getGenre());
        book.setPageCount(bookUpdateDto.getPageCount());
        book.setLanguage(bookUpdateDto.getLanguage());
        book.setCoverImageUrl(bookUpdateDto.getCoverImageUrl());
        book.setDescriptionSummary(bookUpdateDto.getDescriptionSummary());
        book.setRating(bookUpdateDto.getRating());
        book.setCopiesAvailable(bookUpdateDto.getCopiesAvailable());
        book.setDateAdded(bookUpdateDto.getDateAdded());
        book.setStatus(bookUpdateDto.getStatus());
        return book;
    }
}
