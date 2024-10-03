package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.BookOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.BookMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
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

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void updateBook(Long id, Book book) {
        Book existingBook = bookRepository.getReferenceById(id);
        BeanUtils.copyProperties(book, existingBook, "id");
        bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
