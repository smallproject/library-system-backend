package nl.smallproject.www.librarysystembackend.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class UserReviewInputDto {

    @NotBlank(message = "{userReview.userId.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.userId.size}")
    private String userId;

    @PositiveOrZero(message = "{userReview.rating.positiveornotzero}")
    private int rating;

    @NotBlank(message = "{userReview.comments.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.comments.size}")
    private String comments;

    public @NotBlank(message = "{userReview.userId.notblank}") @Size(min = 3, max = 255, message = "{userReview.userId.size}") String getUserId() {
        return userId;
    }

    public void setUserId(@NotBlank(message = "{userReview.userId.notblank}") @Size(min = 3, max = 255, message = "{userReview.userId.size}") String userId) {
        this.userId = userId;
    }

    @PositiveOrZero(message = "{userReview.rating.positiveornotzero}")
    public int getRating() {
        return rating;
    }

    public void setRating(@PositiveOrZero(message = "{userReview.rating.positiveornotzero}") int rating) {
        this.rating = rating;
    }

    public @NotBlank(message = "{userReview.comments.notblank}") @Size(min = 3, max = 255, message = "{userReview.comments.size}") String getComments() {
        return comments;
    }

    public void setComments(@NotBlank(message = "{userReview.comments.notblank}") @Size(min = 3, max = 255, message = "{userReview.comments.size}") String comments) {
        this.comments = comments;
    }
}
