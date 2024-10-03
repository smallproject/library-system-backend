package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.services.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoriesController {
    private final InventoryService inventoryService;

    public InventoriesController( InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Inventory>> getAllInventories() {
        List<Inventory> inventories = inventoryService.getAllInventories();
        return ResponseEntity.ok(inventories);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Inventory> getInventoryById(@PathVariable Long id) {
        Inventory existingInventory = inventoryService.getInventoryById(id);
        return ResponseEntity.ok(existingInventory);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Inventory> createInventory(@RequestBody final Inventory inventory) {
        Inventory savedInventory = inventoryService.saveInventory(inventory);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedInventory);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Inventory> update(@PathVariable Long id, @RequestBody final Inventory inventory) {
        inventoryService.updateInventory(id, inventory);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Inventory> deleteInventory(@PathVariable Long id) {
        inventoryService.deleteInventory(id);
        return ResponseEntity.noContent().build();
    }
}
