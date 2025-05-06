package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Book.BookUpdateDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.BookMapper;
import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.repositories.InventoryRepository;
import nl.smallproject.www.librarysystembackend.repositories.UserReviewRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final UserReviewRepository userReviewRepository;
    private final InventoryRepository inventoryRepository;

    public BookService(BookRepository bookRepository, BookMapper bookMapper, UserReviewRepository userReviewRepository, InventoryRepository inventoryRepository) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.userReviewRepository = userReviewRepository;
        this.inventoryRepository = inventoryRepository;
    }

    public List<BookOutputDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookOutputDto> bookOutputDtos = new ArrayList<>();

        for (var entry : books) {
            bookOutputDtos.add(bookMapper.bookEntityToOutputDto(entry));
        }
        return bookOutputDtos;
    }

    public BookOutputDto getBookById(Long id) {
        Optional<Book> bookOptional = Optional.ofNullable(bookRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Book not found with this id: " + id)));

        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            return bookMapper.bookEntityToOutputDto(book);
        } else {
            throw new RecordNotFoundException("Book not found with this id: " + id);
        }
    }

    @Transactional
    public Book createBook(BookInputDto bookInputDto) {
        Book book = bookMapper.bookInputDtoToEntity(bookInputDto);
        return bookRepository.save(book);
    }

    @Transactional
    public void updateBook(Long id, BookUpdateDto bookUpdateDto) {
        Book existingBook = bookRepository.getReferenceById(id);
        Book updatedBook = bookMapper.bookUpdateDtoToEntity(bookUpdateDto);
        BeanUtils.copyProperties(updatedBook, existingBook, "id");
        bookRepository.save(existingBook);
    }

    @Transactional
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Transactional
    public void assignUserReviewToBook(Long bookId, Long userReviewId) {
        Optional<Book> bookOptional = Optional.ofNullable(bookRepository.findById(bookId)
                .orElseThrow(() -> new RecordNotFoundException("Book not found with this id: " + bookId)));

        Optional<UserReview> userReviewOptional = Optional.ofNullable(userReviewRepository.findById(userReviewId)
                .orElseThrow(() -> new RecordNotFoundException("User review found with this id: " + userReviewId)));

        if (bookOptional.isPresent()) {
            Book existingBook = bookOptional.get();

            if (userReviewOptional.isPresent()) {
                UserReview existingUserReview = userReviewOptional.get();
                List<UserReview> userReviews = new ArrayList<>();
                userReviews.add(existingUserReview);
                existingBook.setUserReviews(userReviews);
                existingUserReview.setBook(existingBook); //Bi-directional
            } else {
                throw new RecordNotFoundException("User Review not found with this id: " +userReviewId);
            }
            bookRepository.save(existingBook);
        } else {
            throw new RecordNotFoundException("Book not found with this id: " +bookId);
        }
    }

    @Transactional
    public void assignInventoryToBook(Long bookId, Long inventoryId) {
        Optional<Book> bookOptional = Optional.ofNullable(bookRepository.findById(bookId)
                .orElseThrow(() -> new RecordNotFoundException("Book not found with this id: " + bookId)));

        Optional<Inventory> inventoryOptional = Optional.ofNullable(inventoryRepository.findById(inventoryId)
                .orElseThrow(() -> new RecordNotFoundException("Inventory not found with this id: " + inventoryId)));

        if (bookOptional.isPresent()) {
            Book existingBook = bookOptional.get();
            if (inventoryOptional.isPresent()) {
                Inventory existingInventory = inventoryOptional.get();
                List<Inventory> inventories = new ArrayList<>();
                inventories.add(existingInventory);
                existingBook.setInventories(inventories);
                existingInventory.setBook(existingBook); // Bi-directional
            } else {
                throw new RecordNotFoundException("Inventory not found with this id: "+inventoryId);
            }
            bookRepository.save(existingBook);
        } else {
            throw new RecordNotFoundException("Book not found with this id: " +bookId);
        }
    }

    public Page<Book> getBooksPagination(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bookRepository.findAll(pageable);
    }

    public Page<Book> getBookByAuthor(Author author, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return bookRepository.findByAuthor(author, pageable);
    }

    public List<BookOutputDto> searchBooksByTitle(String title) {
        List<Book> books = bookRepository.findByTitleContainingIgnoreCase(title);
        List<BookOutputDto> bookOutputDtos = new ArrayList<>();
        for (Book book : books) {
            bookOutputDtos.add(bookMapper.bookEntityToOutputDto(book));
        }
        return bookOutputDtos;
    }
}
