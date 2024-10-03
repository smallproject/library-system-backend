package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.BookOutputDto;
import nl.smallproject.www.librarysystembackend.models.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookOutputDto bookEntityToOutputDto(Book book) {
        BookOutputDto bookOutputDto = new BookOutputDto();
        bookOutputDto.setId(book.getId());
        bookOutputDto.setIsbn(book.getIsbn());
        bookOutputDto.setName(book.getName());
        bookOutputDto.setDescription(book.getDescription());
        bookOutputDto.setPublicationDate(book.getPublicationDate());
        return bookOutputDto;
    }

    public Book bookInputDtoToEntity(BookInputDto bookInputDto) {
        Book book = new Book();
        book.setIsbn(bookInputDto.getIsbn());
        book.setName(bookInputDto.getName());
        book.setDescription(bookInputDto.getDescription());
        book.setPublicationDate(bookInputDto.getPublicationDate());
        return book;
    }
}
