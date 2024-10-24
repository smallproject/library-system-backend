package nl.smallproject.www.librarysystembackend.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest {

    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Should keep inventory id")
    void shouldKeepInventoryId() {
        // arrange
        inventory.setId(1L);

        // act
        Long inventoryId = inventory.getId();

        // assert
        assertEquals(1L, inventoryId);
    }

    @Test
    @DisplayName("Should keep inventory location")
    void shouldKeepInventoryLocation() {
        // arrange
        inventory.setLocation("Shelf A1");

        // act
        String location = inventory.getLocation();

        // assert
        assertEquals("Shelf A1", location);
    }

    @Test
    @DisplayName("Should keep inventory condition")
    void shouldKeepInventoryCondition() {
        // arrange
        inventory.setCondition("Good");

        // act
        String condition = inventory.getCondition();

        // assert
        assertEquals("Good", condition);
    }

    @Test
    @DisplayName("Should keep inventory acquisition  method")
    void shouldKeepInventoryAcquisitionMethod() {
        // arrange
        inventory.setAcquisitionMethod("Purchased");

        // act
        String acquisitionMethod = inventory.getAcquisitionMethod();

        // assert
        assertEquals("Purchased", acquisitionMethod);
    }

    @Test
    @DisplayName("Should keep inventory supplier")
    void shouldKeepInventorySupplier() {
        // arrange
        inventory.setSupplier("BookWorld");

        // act
        String supplier = inventory.getSupplier();

        // assert
        assertEquals("BookWorld", supplier);
    }

    @Test
    @DisplayName("Should keep inventory last inventory check")
    void shouldKeepInventoryLastInventoryCheck() {
        // arrange
        inventory.setLastInventoryCheck(new Date(2024,10,24));

        // act
        Date lastInventoryCheck = inventory.getLastInventoryCheck();

        // assert
        assertEquals(new Date(2024,10,24), lastInventoryCheck);
    }

    @Test
    @DisplayName("Should keep inventory borrow count")
    void shouldKeepInventoryBorrowCount() {
        // arrange
        inventory.setBorrowCount(14);

        // act
        int borrowCount = inventory.getBorrowCount();

        // assert
        assertEquals(14, borrowCount);
    }

    @Test
    @DisplayName("Should keep inventory borrowed status")
    void shouldKeepInventoryBorrowedStatus() {
        // arrange
        inventory.setBorrowedStatus("Available");

        // act
        String borrowedStatus = inventory.getBorrowedStatus();

        // assert
        assertEquals("Available", borrowedStatus);
    }

    @Test
    @DisplayName("Should keep inventory reserve status")
    void shouldKeepInventoryReserveStatus() {
        // arrange
        inventory.setReserveStatus("Not Reserved");

        // act
        String reserveStatus = inventory.getReserveStatus();

        // assert
        assertEquals("Not Reserved", reserveStatus);
    }

    @Test
    @DisplayName("Should keep inventory replacement cost")
    void shouldKeepInventoryReplacementCost() {
        // arrange
        inventory.setReplacementCost(130.50);

        // act
        double replacementCost = inventory.getReplacementCost();

        // assert
        assertEquals(130.50, replacementCost);
    }

    @Test
    @DisplayName("Should keep inventory edition")
    void shouldKeepInventoryEdition() {
        // arrange
        inventory.setEdition("1st Edition");

        // act
        String edition = inventory.getEdition();

        // assert
        assertEquals("1st Edition", edition);
    }

    @Test
    @DisplayName("Should keep inventory publisher")
    void shouldKeepInventoryPublisher() {
        // arrange
        inventory.setPublisher("Penguin Books");

        // act
        String publisher = inventory.getPublisher();

        // assert
        assertEquals("Penguin Books", publisher);
    }

    @Test
    @DisplayName("Should keep inventory notes")
    void shouldKeepInventoryNotes() {
        // arrange
        inventory.setNotes("New arrival");

        // act
        String notes = inventory.getNotes();

        // assert
        assertEquals("New arrival", notes);
    }

    @Test
    @DisplayName("Should keep inventory bar code")
    void shouldKeepInventoryBarcode() {
        // arrange
        inventory.setBarcode("9781234567890");

        // act
        String barcode = inventory.getBarcode();

        // assert
        assertEquals("9781234567890", barcode);
    }

    @Test
    @DisplayName("Should keep inventory isbn")
    void shouldKeepInventoryISBN() {
        // arrange
        inventory.setISBN("978-0-12-345678-9");

        // act
        String isbn = inventory.getISBN();

        // assert
        assertEquals("978-0-12-345678-9", isbn);
    }

    @Test
    @DisplayName("Should keep inventory restock date")
    void shouldKeepInventoryRestockDate() {
        // arrange
        inventory.setRestockDate(new Date(2024,10,24));

        // act
        Date restockDate = inventory.getRestockDate();

        // assert
        assertEquals(new Date(2024, 10, 24), restockDate);
    }

    @Test
    @DisplayName("Should keep inventory times lost")
    void shouldKeepInventoryTimesLost() {
        // arrange
        inventory.setTimesLost(1);

        // act
        int timesLost = inventory.getTimesLost();

        // assert
        assertEquals(1, timesLost);
    }

    @Test
    @DisplayName("Should keep inventory circulation status")
    void shouldKeepInventoryCirculationStatus() {
        // arrange
        inventory.setCirculationStatus("In Circulation");

        // act
        String circulationStatus = inventory.getCirculationStatus();

        // assert
        assertEquals("In Circulation", circulationStatus);
    }

    @Test
    @DisplayName("Should keep inventory purchase date")
    void shouldKeepInventoryPurchaseDate() {
        // arrange
        inventory.setPurchaseDate(new Date(2024, 8, 20));

        // act
        Date purchaseDate = inventory.getPurchaseDate();

        // assert
        assertEquals(new Date(2024,8,20), purchaseDate);
    }
}
