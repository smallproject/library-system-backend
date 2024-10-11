package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.Book.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookUpdateDto;
import nl.smallproject.www.librarysystembackend.dtos.Inventory.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.models.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookMapper {
    private final UserReviewMapper userReviewMapper;
    private final InventoryMapper inventoryMapper;

    public BookMapper(UserReviewMapper userReviewMapper, InventoryMapper inventoryMapper) {
        this.userReviewMapper = userReviewMapper;
        this.inventoryMapper = inventoryMapper;
    }

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

        if (book.getUserReviews() != null) {
            List<UserReviewOutputDto> userReviewOutputDtos = new ArrayList<>();
            for (var userReview : book.getUserReviews()) {
                userReviewOutputDtos.add(userReviewMapper.userReviewEntityToOutputDto(userReview));
            }
            bookOutputDto.setUserReviewOutputDtos(userReviewOutputDtos);
        }

        if (book.getInventories() != null) {
            List<InventoryOutputDto> inventoryOutputDtos = new ArrayList<>();
            for (var inventory : book.getInventories()) {
                inventoryOutputDtos.add(inventoryMapper.inventoryEntityToOutputDto(inventory));
            }
            bookOutputDto.setInventoryOutputDtos(inventoryOutputDtos);
        }
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
