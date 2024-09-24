package nl.smallproject.www.librarysystembackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "userreviews")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userid")
    private String userId;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comments")
    private String comments;
}
