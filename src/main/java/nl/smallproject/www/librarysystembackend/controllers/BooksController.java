package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/books")
public class BooksController {
    @Autowired
    private BookRepository booksRepository;

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
}
