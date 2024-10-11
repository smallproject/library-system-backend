package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorUpdateDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.AuthorMapper;
import nl.smallproject.www.librarysystembackend.models.Author;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.repositories.AuthorRepository;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;
    private final BookRepository bookRepository;

    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
        this.bookRepository = bookRepository;
    }

    public List<AuthorOutputDto> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        List<AuthorOutputDto> authorOutputDtos = new ArrayList<>();
        for (Author author : authors) {
            authorOutputDtos.add(authorMapper.authorEntityToOutputDto(author));
        }
        return authorOutputDtos;
    }

    public AuthorOutputDto getAuthorById(Long id) {
        Optional<Author> authorOptional = Optional.ofNullable(authorRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Author not found with this id: " + id)));

        if (authorOptional.isPresent()) {
            Author author = authorOptional.get();
            return authorMapper.authorEntityToOutputDto(author);
        } else {
            throw new RecordNotFoundException("Author not found with this id: " + id);
        }
    }

    public Author createAuthor(AuthorInputDto authorInputDto) {
        Author author = authorMapper.authorInputDtoToEntity(authorInputDto);
        authorRepository.save(author);
        return author;
    }

    public void updateAuthor(Long id, AuthorUpdateDto authorUpdateDto) {
        Author existingAuthor = authorRepository.getReferenceById(id);
        Author updatedAuthor = authorMapper.authorUpdateDtoToEntity(authorUpdateDto);
        BeanUtils.copyProperties(updatedAuthor, existingAuthor, "id");
        authorRepository.save(existingAuthor);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public void assignBookToAuthor(Long authorId, Long bookId) {
        Optional<Author> authorOptional = Optional.ofNullable(authorRepository.findById(authorId)
                .orElseThrow(() -> new RecordNotFoundException("Author not found with this id: " + authorId)));

        Optional<Book> bookOptional = Optional.ofNullable(bookRepository.findById(bookId)
                .orElseThrow(() -> new RecordNotFoundException("Book not found with this id: " + bookId)));

        if (authorOptional.isPresent()) {
            Author existingAuthor = authorOptional.get();

            if (bookOptional.isPresent()) {
                Book existingBook = bookOptional.get();
                //needs further research
//                existingAuthor.setBooks(Collections.singletonList(existingBook));

                List<Book> books = new ArrayList<>();
                books.add(existingBook);
                existingAuthor.setBooks(books);
                existingBook.setAuthor(existingAuthor); //Bi-directional
            } else {
                throw new RecordNotFoundException("Author not found with this id: "+authorId);
            }
            authorRepository.save(existingAuthor);
        }
    }
}
