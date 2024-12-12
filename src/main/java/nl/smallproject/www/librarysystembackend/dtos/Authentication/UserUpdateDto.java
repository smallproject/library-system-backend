package nl.smallproject.www.librarysystembackend.dtos.Authentication;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserUpdateDto {
    @NotBlank(message = "not black")
    @Size(min = 3, max = 255, message = "size incorrect")
    private String name;

    @NotBlank(message = "not black")
    @Size(min = 3, max = 255, message = "size incorrect")
    private String bio;

    @NotBlank(message = "not black")
    @Size(min = 3, max = 255, message = "size incorrect")
    private String location;

    @NotBlank(message = "not black")
    @Size(min = 3, max = 255, message = "size incorrect")
    private String email;

    public @NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String name) {
        this.name = name;
    }

    public @NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String getBio() {
        return bio;
    }

    public void setBio(@NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String bio) {
        this.bio = bio;
    }

    public @NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String location) {
        this.location = location;
    }

    public @NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "not black") @Size(min = 3, max = 255, message = "size incorrect") String email) {
        this.email = email;
    }
}
