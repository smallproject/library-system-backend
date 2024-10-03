package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.dtos.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorsController {
    private final AuthorService authorService;

    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<AuthorOutputDto>> getAllAuthors() {
        List<AuthorOutputDto> authorOutputDtos = authorService.getAllAuthors();
        return  ResponseEntity.ok(authorOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<AuthorOutputDto> getAuthorById(@PathVariable long id) {
        AuthorOutputDto authorOutputDto = authorService.getAuthorById(id);
        return ResponseEntity.ok(authorOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.saveAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAuthor);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        authorService.updateAuthor(id, author);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Author> deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }
}
