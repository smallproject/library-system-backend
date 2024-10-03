package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import org.springframework.stereotype.Component;

@Component
public class InventoryMapper {
    public InventoryOutputDto inventoryEntityToOutputDto(Inventory inventory) {
        InventoryOutputDto inventoryOutputDto = new InventoryOutputDto();
        inventoryOutputDto.setId(inventory.getId());
        inventoryOutputDto.setBook(inventory.getBook());
        inventoryOutputDto.setCount(inventory.getCount());
        inventoryOutputDto.setDate(inventory.getDate());
        inventoryOutputDto.setAvailable(inventory.getAvailable());
        return inventoryOutputDto;
    }
}
