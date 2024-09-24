package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.repositories.InventoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoriesController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping
    @RequestMapping("{id}")
    public Inventory get(@PathVariable Long id) {
        return inventoryRepository.getReferenceById(id);
    }

    @PostMapping("/addInventory")
    public Inventory create(@RequestBody final Inventory inventory) {
        return inventoryRepository.saveAndFlush(inventory);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        inventoryRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Inventory update(@PathVariable Long id, @RequestBody final Inventory inventory) {
        Inventory existingInventory = inventoryRepository.getReferenceById(id);
        BeanUtils.copyProperties(inventory, existingInventory, "id");
        return inventoryRepository.saveAndFlush(existingInventory);
    }
}
