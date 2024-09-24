package nl.smallproject.www.librarysystembackend.repositories;

import nl.smallproject.www.librarysystembackend.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

//necessary for reading into the database
//@RepositoryRestController
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
