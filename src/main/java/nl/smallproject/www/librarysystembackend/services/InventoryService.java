package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.Inventory.InventoryInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Inventory.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Inventory.InventoryUpdateDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.InventoryMapper;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.repositories.InventoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<InventoryOutputDto> getAllInventories() {
        List<Inventory> inventories = inventoryRepository.findAll();
        List<InventoryOutputDto> inventoryOutputDtos = new ArrayList<>();

        for (var inventory : inventories) {
            inventoryOutputDtos.add(inventoryMapper.inventoryEntityToOutputDto(inventory));
        }

        return inventoryOutputDtos;
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

    @Transactional
    public Inventory createInventory(InventoryInputDto inventoryInputDto) {
        Inventory inventory = inventoryMapper.inventoryInputDtoToEntity(inventoryInputDto);
        return inventoryRepository.save(inventory);
    }

    @Transactional
    public void updateInventory(Long id, InventoryUpdateDto inventoryUpdateDto) {
        Inventory existingInventory = inventoryRepository.getReferenceById(id);
        Inventory updatedInventory = inventoryMapper.inventoryUpdateDtoToEntity(inventoryUpdateDto);

        BeanUtils.copyProperties(updatedInventory, existingInventory, "id");
        inventoryRepository.save(existingInventory);
    }

    @Transactional
    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}
