package nl.smallproject.www.librarysystembackend.dtos.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class UserUpdateDto {

    @NotBlank(message = "{user.username.notblank}")
    @Size(min = 3, max = 255, message = "{user.username.size}")
    private String username;

    @NotBlank(message = "{user.email.notblank}")
    @Size(min = 3, max = 255, message = "{user.email.size}")
    @Email
    private String email;

    @NotBlank(message = "{user.passwordHash.notblank}")
    @Size(min = 3, max = 255, message = "{user.passwordHash.size}")
    private String passwordHash;

    @NotNull(message = "{user.createdAt.notnull}" )
    private Date createdAt;

    @NotNull(message = "{user.updatedAt.notnull}" )
    private Date updatedAt;

    public @NotBlank(message = "{user.username.notblank}") @Size(min = 3, max = 255, message = "{user.username.size}") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "{user.username.notblank}") @Size(min = 3, max = 255, message = "{user.username.size}") String username) {
        this.username = username;
    }

    public @NotBlank(message = "{user.email.notblank}") @Size(min = 3, max = 255, message = "{user.email.size}") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "{user.email.notblank}") @Size(min = 3, max = 255, message = "{user.email.size}") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "{user.passwordHash.notblank}") @Size(min = 3, max = 255, message = "{user.passwordHash.size}") String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(@NotBlank(message = "{user.passwordHash.notblank}") @Size(min = 3, max = 255, message = "{user.passwordHash.size}") String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public @NotNull(message = "{user.createdAt.notnull}") Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NotNull(message = "{user.createdAt.notnull}") Date createdAt) {
        this.createdAt = createdAt;
    }

    public @NotNull(message = "{user.updatedAt.notnull}") Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@NotNull(message = "{user.updatedAt.notnull}") Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
