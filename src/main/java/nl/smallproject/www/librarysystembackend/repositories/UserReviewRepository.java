package nl.smallproject.www.librarysystembackend.repositories;

import nl.smallproject.www.librarysystembackend.models.UserReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

//@RepositoryRestController
public interface UserReviewRepository extends JpaRepository<UserReview, Long> {
}
