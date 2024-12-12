package nl.smallproject.www.librarysystembackend.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserModel {

    private Long id = -1L;
    private String username;
    private String password;
    private List<RoleModel> roles = new ArrayList<>();
    private boolean isExpired;
    private boolean isLocked;
    private boolean areCredentialsExpired;
    private boolean isEnabled;

    private String name;
    private String bio;
    private String location;
    private String email;

    public UserModel() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel(Long id) {
        this.id = id;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean areCredentialsExpired() {
        return areCredentialsExpired;
    }

    public void areCredentialsExpired(boolean areCredentialsExpired) {
        this.areCredentialsExpired = areCredentialsExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public List<RoleModel> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleModel> roles) {
        this.roles = roles;
    }

    public List<String> getRoleNames() {
        return roles.stream()
                .map(RoleModel::getRoleName)
                .collect(Collectors.toList());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAreCredentialsExpired() {
        return areCredentialsExpired;
    }

    public void setAreCredentialsExpired(boolean areCredentialsExpired) {
        this.areCredentialsExpired = areCredentialsExpired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

