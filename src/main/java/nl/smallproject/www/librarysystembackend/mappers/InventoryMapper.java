package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.InventoryInputDto;
import nl.smallproject.www.librarysystembackend.dtos.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.InventoryUpdateDto;
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

    public Inventory inventoryInputDtoToEntity(InventoryInputDto inventoryInputDto) {
        Inventory inventory = new Inventory();
        inventory.setBook(inventoryInputDto.getBook());
        inventory.setCount(inventoryInputDto.getCount());
        inventory.setDate(inventoryInputDto.getDate());
        inventory.setAvailable(inventoryInputDto.getAvailable());
        return inventory;
    }

    public Inventory inventoryUpdateDtoToEntity(InventoryUpdateDto inventoryUpdateDto) {
        Inventory inventory = new Inventory();
        inventory.setBook(inventoryUpdateDto.getBook());
        inventory.setCount(inventoryUpdateDto.getCount());
        inventory.setDate(inventoryUpdateDto.getDate());
        inventory.setAvailable(inventoryUpdateDto.getAvailable());
        return inventory;
    }
}
