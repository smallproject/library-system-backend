package nl.smallproject.www.librarysystembackend.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class InventoryUpdateDto {

    @PositiveOrZero(message = "{inventory.book.positiveornotzero}")
    private Long book;

    @PositiveOrZero(message = "{inventory.count.positiveornotzero}")
    private int count;

    @NotBlank(message = "{inventory.date.notblank}")
    private Date date;

    @NotBlank(message = "{inventory.available.notblank}")
    @Size(min = 3, max = 255, message = "{inventory.available.size}")
    private String available;

    public @PositiveOrZero(message = "{inventory.book.positiveornotzero}") Long getBook() {
        return book;
    }

    public void setBook(@PositiveOrZero(message = "{inventory.book.positiveornotzero}") Long book) {
        this.book = book;
    }

    @PositiveOrZero(message = "{inventory.count.positiveornotzero}")
    public int getCount() {
        return count;
    }

    public void setCount(@PositiveOrZero(message = "{inventory.count.positiveornotzero}") int count) {
        this.count = count;
    }

    public @NotBlank(message = "{inventory.date.notblank}") Date getDate() {
        return date;
    }

    public void setDate(@NotBlank(message = "{inventory.date.notblank}") Date date) {
        this.date = date;
    }

    public @NotBlank(message = "{inventory.available.notblank}") @Size(min = 3, max = 255, message = "{inventory.available.size}") String getAvailable() {
        return available;
    }

    public void setAvailable(@NotBlank(message = "{inventory.available.notblank}") @Size(min = 3, max = 255, message = "{inventory.available.size}") String available) {
        this.available = available;
    }
}
