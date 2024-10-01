package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.AuthorMapper;
import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.repositories.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AuthorOutputDto getAuthorById(Long id) {
        Optional<Author> authorOptional = Optional.ofNullable(authorRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Author not found with this id: " + id)));

        if (authorOptional.isPresent()) {
            Author author = authorOptional.get();
            return authorMapper.AuthorEntityToOutputDto(author);
        } else {
            throw new RecordNotFoundException("Author not found with this id: " + id);
        }
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
