package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.repositories.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void updateAuthor(Long id, Author author) {
        Author existingAuthor = authorRepository.getReferenceById(id);
        BeanUtils.copyProperties(author, existingAuthor, "id");
        authorRepository.save(existingAuthor);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
