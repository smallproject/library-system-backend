package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.repositories.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorsController {
    @Autowired
    private AuthorRepository authorsRepository;

    @GetMapping
    @RequestMapping("{id}")
    public Author get(@PathVariable Long id) {
        return authorsRepository.getReferenceById(id);
    }

    @PostMapping("/addAuthor")
    public Author create(@RequestBody final Author author) {
        return authorsRepository.saveAndFlush(author);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        authorsRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Author update(@PathVariable Long id,@RequestBody Author author) {
        Author existingAuthor = authorsRepository.getReferenceById(id);
        BeanUtils.copyProperties(author, existingAuthor, "id");
        return authorsRepository.saveAndFlush(existingAuthor);
    }
}
