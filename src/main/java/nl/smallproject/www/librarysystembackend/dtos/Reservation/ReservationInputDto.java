package nl.smallproject.www.librarysystembackend.dtos.Reservation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class ReservationInputDto {

    @NotNull(message = "NotNull")
    private Long userId;

    @NotNull(message = "NotNull")
    private Long bookId;

    @NotNull(message = "NotNull" )
    private Date reservationDate;

    @NotNull(message = "NotNull" )
    private Date expiryDate;

    @NotBlank(message = "NotBlank")
    @Size(min = 3, max = 255, message = "Size 3")
    private String status;

    @NotBlank(message = "NotBlank")
    @Size(min = 3, max = 255, message = "Size 3")
    private String pickupLocation;

    private String notes;

    @NotBlank(message = "NotBlank")
    @Size(min = 3, max = 255, message = "Size 3")
    private String reservationCode;

    @NotNull(message = "NotNull" )
    private Date createAt;

    @NotNull(message = "NotNull" )
    private Date updateAt;

    public @NotNull(message = "NotNull") Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "NotNull") Long userId) {
        this.userId = userId;
    }

    public @NotNull(message = "NotNull") Long getBookId() {
        return bookId;
    }

    public void setBookId(@NotNull(message = "NotNull") Long bookId) {
        this.bookId = bookId;
    }

    public @NotNull(message = "NotNull") Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(@NotNull(message = "NotNull") Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public @NotNull(message = "NotNull") Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(@NotNull(message = "NotNull") Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String getStatus() {
        return status;
    }

    public void setStatus(@NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String status) {
        this.status = status;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(@NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(@NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "Size 3") String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public @NotNull(message = "NotNull") Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(@NotNull(message = "NotNull") Date createAt) {
        this.createAt = createAt;
    }

    public @NotNull(message = "NotNull") Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(@NotNull(message = "NotNull") Date updateAt) {
        this.updateAt = updateAt;
    }
}
