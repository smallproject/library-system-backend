package nl.smallproject.www.librarysystembackend.controllers;

import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorUpdateDto;
import nl.smallproject.www.librarysystembackend.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
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
    public ResponseEntity<AuthorOutputDto> getAuthorById(@PathVariable Long id) {
        AuthorOutputDto authorOutputDto = authorService.getAuthorById(id);
        return ResponseEntity.ok(authorOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createAuthor(@Valid @RequestBody final AuthorInputDto authorInputDto) {
        var newAuthor = authorService.createAuthor(authorInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newAuthor.getId())
                .buildAndExpand(newAuthor)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newAuthor);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateAuthor(@PathVariable Long id,@Valid @RequestBody final AuthorUpdateDto authorUpdateDto) {
        authorService.updateAuthor(id, authorUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }
}
