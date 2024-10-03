package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.dtos.InventoryInputDto;
import nl.smallproject.www.librarysystembackend.dtos.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.InventoryUpdateDto;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.services.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoriesController {
    private final InventoryService inventoryService;

    public InventoriesController( InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<InventoryOutputDto>> getAllInventories() {
        List<InventoryOutputDto> inventoryOutputDtos = inventoryService.getAllInventories();
        return ResponseEntity.ok(inventoryOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<InventoryOutputDto> getInventoryById(@PathVariable Long id) {
        InventoryOutputDto inventoryOutputDto = inventoryService.getInventoryById(id);
        return ResponseEntity.ok(inventoryOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createInventory(@RequestBody final InventoryInputDto inventoryInputDto) {
        Inventory newInventory = inventoryService.createInventory(inventoryInputDto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newInventory.getId())
                .buildAndExpand(newInventory)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newInventory);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody final InventoryUpdateDto inventoryUpdateDto) {
        inventoryService.updateInventory(id, inventoryUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteInventory(@PathVariable Long id) {
        inventoryService.deleteInventory(id);
        return ResponseEntity.noContent().build();
    }
}
