package nl.smallproject.www.librarysystembackend.models;

import jakarta.persistence.*;

import java.util.Date;

//necessary for writing into the database
//@Data
@Entity(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;
}
