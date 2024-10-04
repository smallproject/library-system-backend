package nl.smallproject.www.librarysystembackend.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class InventoryUpdateDto {
    @NotBlank(message = "{inventory.location.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.location.size}")
    private String location;

    @NotBlank(message = "{inventory.condition.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.condition.size}")
    private String condition;

    @NotBlank(message = "{inventory.acquisitionMethod.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.acquisitionMethod.size}")
    private String acquisitionMethod;

    @NotBlank(message = "{inventory.supplier.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.supplier.size}")
    private String supplier;

    @NotNull(message = "{inventory.lastInventoryCheck.notblank}" )
    private Date lastInventoryCheck;

    @PositiveOrZero(message = "{inventory.borrowCount.positiveornotzero}")
    private Integer borrowCount;

    @NotBlank(message = "{inventory.borrowedStatus.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.borrowedStatus.size}")
    private String borrowedStatus;

    @NotBlank(message = "{inventory.reserveStatus.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.reserveStatus.size}")
    private String reserveStatus;

    @PositiveOrZero(message = "{inventory.replacementCost.positiveornotzero}")
    private Double replacementCost;

    @NotBlank(message = "{inventory.edition.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.edition.size}")
    private String edition;

    @NotBlank(message = "{inventory.publisher.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.publisher.size}")
    private String publisher;

    @NotBlank(message = "{inventory.notes.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.notes.size}")
    private String notes;

    @NotBlank(message = "{inventory.barcode.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.barcode.size}")
    private String barcode;

    @NotBlank(message = "{inventory.ISBN.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.ISBN.size}")
    private String ISBN;

    @NotNull(message = "{inventory.restockDate.notblank}" )
    private Date restockDate;

    @PositiveOrZero(message = "{inventory.timesLost.positiveornotzero}")
    private Integer timesLost;

    @NotBlank(message = "{inventory.circulationStatus.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.circulationStatus.size}")
    private String circulationStatus;

    @NotNull(message = "{inventory.purchaseDate.notblank}" )
    private Date purchaseDate;

    public @NotBlank(message = "{inventory.location.notblank}") @Size(min = 3, max = 255, message = "{inventory.location.size}") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "{inventory.location.notblank}") @Size(min = 3, max = 255, message = "{inventory.location.size}") String location) {
        this.location = location;
    }

    public @NotBlank(message = "{inventory.condition.notblank}") @Size(min = 3, max = 255, message = "{inventory.condition.size}") String getCondition() {
        return condition;
    }

    public void setCondition(@NotBlank(message = "{inventory.condition.notblank}") @Size(min = 3, max = 255, message = "{inventory.condition.size}") String condition) {
        this.condition = condition;
    }

    public @NotBlank(message = "{inventory.acquisitionMethod.notblank}") @Size(min = 3, max = 255, message = "{inventory.acquisitionMethod.size}") String getAcquisitionMethod() {
        return acquisitionMethod;
    }

    public void setAcquisitionMethod(@NotBlank(message = "{inventory.acquisitionMethod.notblank}") @Size(min = 3, max = 255, message = "{inventory.acquisitionMethod.size}") String acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public @NotBlank(message = "{inventory.supplier.notblank}") @Size(min = 3, max = 255, message = "{inventory.supplier.size}") String getSupplier() {
        return supplier;
    }

    public void setSupplier(@NotBlank(message = "{inventory.supplier.notblank}") @Size(min = 3, max = 255, message = "{inventory.supplier.size}") String supplier) {
        this.supplier = supplier;
    }

    public @NotNull(message = "{inventory.lastInventoryCheck.notblank}") Date getLastInventoryCheck() {
        return lastInventoryCheck;
    }

    public void setLastInventoryCheck(@NotNull(message = "{inventory.lastInventoryCheck.notblank}") Date lastInventoryCheck) {
        this.lastInventoryCheck = lastInventoryCheck;
    }

    public @PositiveOrZero(message = "{inventory.borrowCount.positiveornotzero}") Integer getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(@PositiveOrZero(message = "{inventory.borrowCount.positiveornotzero}") Integer borrowCount) {
        this.borrowCount = borrowCount;
    }

    public @NotBlank(message = "{inventory.borrowedStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.borrowedStatus.size}") String getBorrowedStatus() {
        return borrowedStatus;
    }

    public void setBorrowedStatus(@NotBlank(message = "{inventory.borrowedStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.borrowedStatus.size}") String borrowedStatus) {
        this.borrowedStatus = borrowedStatus;
    }

    public @NotBlank(message = "{inventory.reserveStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.reserveStatus.size}") String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(@NotBlank(message = "{inventory.reserveStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.reserveStatus.size}") String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    public @PositiveOrZero(message = "{inventory.replacementCost.positiveornotzero}") Double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(@PositiveOrZero(message = "{inventory.replacementCost.positiveornotzero}") Double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public @NotBlank(message = "{inventory.edition.notblank}") @Size(min = 3, max = 255, message = "{inventory.edition.size}") String getEdition() {
        return edition;
    }

    public void setEdition(@NotBlank(message = "{inventory.edition.notblank}") @Size(min = 3, max = 255, message = "{inventory.edition.size}") String edition) {
        this.edition = edition;
    }

    public @NotBlank(message = "{inventory.publisher.notblank}") @Size(min = 3, max = 255, message = "{inventory.publisher.size}") String getPublisher() {
        return publisher;
    }

    public void setPublisher(@NotBlank(message = "{inventory.publisher.notblank}") @Size(min = 3, max = 255, message = "{inventory.publisher.size}") String publisher) {
        this.publisher = publisher;
    }

    public @NotBlank(message = "{inventory.notes.notblank}") @Size(min = 3, max = 255, message = "{inventory.notes.size}") String getNotes() {
        return notes;
    }

    public void setNotes(@NotBlank(message = "{inventory.notes.notblank}") @Size(min = 3, max = 255, message = "{inventory.notes.size}") String notes) {
        this.notes = notes;
    }

    public @NotBlank(message = "{inventory.barcode.notblank}") @Size(min = 3, max = 255, message = "{inventory.barcode.size}") String getBarcode() {
        return barcode;
    }

    public void setBarcode(@NotBlank(message = "{inventory.barcode.notblank}") @Size(min = 3, max = 255, message = "{inventory.barcode.size}") String barcode) {
        this.barcode = barcode;
    }

    public @NotBlank(message = "{inventory.ISBN.notblank}") @Size(min = 3, max = 255, message = "{inventory.ISBN.size}") String getISBN() {
        return ISBN;
    }

    public void setISBN(@NotBlank(message = "{inventory.ISBN.notblank}") @Size(min = 3, max = 255, message = "{inventory.ISBN.size}") String ISBN) {
        this.ISBN = ISBN;
    }

    public @NotNull(message = "{inventory.restockDate.notblank}") Date getRestockDate() {
        return restockDate;
    }

    public void setRestockDate(@NotNull(message = "{inventory.restockDate.notblank}") Date restockDate) {
        this.restockDate = restockDate;
    }

    public @PositiveOrZero(message = "{inventory.timesLost.positiveornotzero}") Integer getTimesLost() {
        return timesLost;
    }

    public void setTimesLost(@PositiveOrZero(message = "{inventory.timesLost.positiveornotzero}") Integer timesLost) {
        this.timesLost = timesLost;
    }

    public @NotBlank(message = "{inventory.circulationStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.circulationStatus.size}") String getCirculationStatus() {
        return circulationStatus;
    }

    public void setCirculationStatus(@NotBlank(message = "{inventory.circulationStatus.notblank}") @Size(min = 3, max = 255, message = "{inventory.circulationStatus.size}") String circulationStatus) {
        this.circulationStatus = circulationStatus;
    }

    public @NotNull(message = "{inventory.purchaseDate.notblank}") Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(@NotNull(message = "{inventory.purchaseDate.notblank}") Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
