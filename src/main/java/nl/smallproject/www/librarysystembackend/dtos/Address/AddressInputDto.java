package nl.smallproject.www.librarysystembackend.dtos.Address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class AddressInputDto {
    @PositiveOrZero(message = "PositiveOrZero")
    private Long id;

    @NotBlank(message = "NotBlank")
    @Size(min = 3, max = 255, message = "size 3")
    private String street;

    @NotBlank(message = "NotBlank")
    @Size(min = 1, max = 255, message = "size 1")
    private String houseNo;

    @NotBlank(message = "NotBlank")
    @Size(min = 3, max = 255, message = "size 3")
    private String postCode;

    public @PositiveOrZero(message = "PositiveOrZero") Long getId() {
        return id;
    }

    public void setId(@PositiveOrZero(message = "PositiveOrZero") Long id) {
        this.id = id;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "size 3") String getStreet() {
        return street;
    }

    public void setStreet(@NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "size 3") String street) {
        this.street = street;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 1, max = 255, message = "size 1") String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(@NotBlank(message = "NotBlank") @Size(min = 1, max = 255, message = "size 1") String houseNo) {
        this.houseNo = houseNo;
    }

    public @NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "size 3") String getPostCode() {
        return postCode;
    }

    public void setPostCode(@NotBlank(message = "NotBlank") @Size(min = 3, max = 255, message = "size 3") String postCode) {
        this.postCode = postCode;
    }
}
