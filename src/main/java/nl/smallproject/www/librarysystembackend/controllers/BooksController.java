package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.services.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksController {
    @Autowired
    private BookRepository booksRepository;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @RequestMapping("{id}")
    public Book get(@PathVariable Long id) {
        return booksRepository.getReferenceById(id);
    }

    @PostMapping("/addBook")
    public Book create(@RequestBody final Book book) {
        return booksRepository.saveAndFlush(book);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        Book existingBook = booksRepository.getReferenceById(id);
        BeanUtils.copyProperties(book, existingBook, "id");
        return booksRepository.saveAndFlush(existingBook);
    }


//    Alternatief path, needs to be researched
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
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
