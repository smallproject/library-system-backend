package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.repositories.AuthorRepository;
import nl.smallproject.www.librarysystembackend.services.AuthorService;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorsController {
//    @Autowired
//    private AuthorRepository authorsRepository;
//
//    @GetMapping
//    @RequestMapping("{id}")
//    public Author get(@PathVariable Long id) {
//        return authorsRepository.getReferenceById(id);
//    }
//
//    @PostMapping("/addAuthor")
//    public Author create(@RequestBody final Author author) {
//        return authorsRepository.saveAndFlush(author);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Long id) {
//        authorsRepository.deleteById(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public Author update(@PathVariable Long id,@RequestBody Author author) {
//        Author existingAuthor = authorsRepository.getReferenceById(id);
//        BeanUtils.copyProperties(author, existingAuthor, "id");
//        return authorsRepository.saveAndFlush(existingAuthor);
//    }


//    Alternatief path, needs to be researched

    private final AuthorService authorService;

    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        return  ResponseEntity.ok(authors);
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
