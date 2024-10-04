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
        inventory.setLocation(inventoryInputDto.getLocation());
        inventory.setCondition(inventoryInputDto.getCondition());
        inventory.setAcquisitionMethod(inventoryInputDto.getAcquisitionMethod());
        inventory.setSupplier(inventoryInputDto.getSupplier());
        inventory.setLastInventoryCheck(inventoryInputDto.getLastInventoryCheck());
        inventory.setBorrowCount(inventoryInputDto.getBorrowCount());
        inventory.setBorrowedStatus(inventoryInputDto.getBorrowedStatus());
        inventory.setReserveStatus(inventoryInputDto.getReserveStatus());
        inventory.setReplacementCost(inventoryInputDto.getReplacementCost());
        inventory.setEdition(inventoryInputDto.getEdition());
        inventory.setPublisher(inventoryInputDto.getPublisher());
        inventory.setNotes(inventoryInputDto.getNotes());
        inventory.setBarcode(inventoryInputDto.getBarcode());
        inventory.setISBN(inventoryInputDto.getISBN());
        inventory.setRestockDate(inventoryInputDto.getRestockDate());
        inventory.setTimesLost(inventoryInputDto.getTimesLost());
        inventory.setCirculationStatus(inventoryInputDto.getCirculationStatus());
        inventory.setPurchaseDate(inventoryInputDto.getPurchaseDate());
        return inventory;
    }

    public Inventory inventoryUpdateDtoToEntity(InventoryUpdateDto inventoryUpdateDto) {
        Inventory inventory = new Inventory();
        inventory.setLocation(inventoryUpdateDto.getLocation());
        inventory.setCondition(inventoryUpdateDto.getCondition());
        inventory.setAcquisitionMethod(inventoryUpdateDto.getAcquisitionMethod());
        inventory.setSupplier(inventoryUpdateDto.getSupplier());
        inventory.setLastInventoryCheck(inventoryUpdateDto.getLastInventoryCheck());
        inventory.setBorrowCount(inventoryUpdateDto.getBorrowCount());
        inventory.setBorrowedStatus(inventoryUpdateDto.getBorrowedStatus());
        inventory.setReserveStatus(inventoryUpdateDto.getReserveStatus());
        inventory.setReplacementCost(inventoryUpdateDto.getReplacementCost());
        inventory.setEdition(inventoryUpdateDto.getEdition());
        inventory.setPublisher(inventoryUpdateDto.getPublisher());
        inventory.setNotes(inventoryUpdateDto.getNotes());
        inventory.setBarcode(inventoryUpdateDto.getBarcode());
        inventory.setISBN(inventoryUpdateDto.getISBN());
        inventory.setRestockDate(inventoryUpdateDto.getRestockDate());
        inventory.setTimesLost(inventoryUpdateDto.getTimesLost());
        inventory.setCirculationStatus(inventoryUpdateDto.getCirculationStatus());
        inventory.setPurchaseDate(inventoryUpdateDto.getPurchaseDate());
        return inventory;
    }
}
