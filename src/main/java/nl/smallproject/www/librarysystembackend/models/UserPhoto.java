package nl.smallproject.www.librarysystembackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "userphoto")
public class UserPhoto {

    @Id
    private String fileName;
    public UserPhoto() {
    }

    public UserPhoto(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}
