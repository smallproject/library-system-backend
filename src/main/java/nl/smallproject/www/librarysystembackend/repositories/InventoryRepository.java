package nl.smallproject.www.librarysystembackend.repositories;

import nl.smallproject.www.librarysystembackend.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

//@RepositoryRestController
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
