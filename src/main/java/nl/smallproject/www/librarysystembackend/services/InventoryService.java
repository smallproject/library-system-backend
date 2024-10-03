package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.InventoryMapper;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.repositories.InventoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    public InventoryService(InventoryRepository inventoryRepository, InventoryMapper inventoryMapper) {
        this.inventoryRepository = inventoryRepository;
        this.inventoryMapper = inventoryMapper;
    }

    public List<Inventory> getAllInventories() {
        return inventoryRepository.findAll();
    }

    public InventoryOutputDto getInventoryById(Long id) {
        Optional<Inventory> inventoryOptional = Optional.ofNullable(inventoryRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Inventory not found with this id: " + id)));

        if (inventoryOptional.isPresent()) {
            Inventory inventory = inventoryOptional.get();
            return inventoryMapper.inventoryEntityToOutputDto(inventory);

        } else {
            throw new RecordNotFoundException("Inventory not found with this id: " +id);
        }

    }

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public void updateInventory(Long id, Inventory inventory) {
        Inventory existingInventory = inventoryRepository.getReferenceById(id);
        BeanUtils.copyProperties(inventory, existingInventory, "id");
        inventoryRepository.save(existingInventory);
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}
