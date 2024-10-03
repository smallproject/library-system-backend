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
        inventoryOutputDto.setLocation(inventory.getLocation());
        inventoryOutputDto.setCondition(inventory.getCondition());
        inventoryOutputDto.setAcquisitionMethod(inventory.getAcquisitionMethod());
        inventoryOutputDto.setSupplier(inventory.getSupplier());
        inventoryOutputDto.setLastInventoryCheck(inventory.getLastInventoryCheck());
        inventoryOutputDto.setBorrowCount(inventory.getBorrowCount());
        inventoryOutputDto.setBorrowedStatus(inventory.getBorrowedStatus());
        inventoryOutputDto.setReserveStatus(inventory.getReserveStatus());
        inventoryOutputDto.setReplacementCost(inventory.getReplacementCost());
        inventoryOutputDto.setEdition(inventory.getEdition());
        inventoryOutputDto.setPublisher(inventory.getPublisher());
        inventoryOutputDto.setNotes(inventory.getNotes());
        inventoryOutputDto.setBarcode(inventory.getBarcode());
        inventoryOutputDto.setISBN(inventory.getISBN());
        inventoryOutputDto.setRestockDate(inventory.getRestockDate());
        inventoryOutputDto.setTimesLost(inventory.getTimesLost());
        inventoryOutputDto.setCirculationStatus(inventory.getCirculationStatus());
        inventoryOutputDto.setPurchaseDate(inventory.getPurchaseDate());
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
