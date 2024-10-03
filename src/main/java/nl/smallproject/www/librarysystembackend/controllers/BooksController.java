package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.dtos.BookInputDto;
import nl.smallproject.www.librarysystembackend.dtos.BookOutputDto;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {
    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BookOutputDto>> getAllBooks() {
        List<BookOutputDto> bookOutputDtos = bookService.getAllBooks();
        return ResponseEntity.ok(bookOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<BookOutputDto> getBookById(@PathVariable long id) {
        BookOutputDto bookOutputDto = bookService.getBookById(id);
        return ResponseEntity.ok(bookOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createBook(@RequestBody BookInputDto bookInputDto) {
        Book newBook = bookService.createBook(bookInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newBook.getId())
                .buildAndExpand(newBook)
                .toUri();
        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newBook);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
