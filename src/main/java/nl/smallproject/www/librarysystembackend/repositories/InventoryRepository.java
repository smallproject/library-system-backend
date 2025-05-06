package nl.smallproject.www.librarysystembackend.repositories;

import nl.smallproject.www.librarysystembackend.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
