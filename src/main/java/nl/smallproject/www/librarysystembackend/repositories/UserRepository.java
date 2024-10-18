package nl.smallproject.www.librarysystembackend.repositories;

import nl.smallproject.www.librarysystembackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
