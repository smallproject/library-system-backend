package nl.smallproject.www.librarysystembackend.dtos.UserReview;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class UserReviewInputDto {

    @NotBlank(message = "{userReview.userId.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.userId.size}")
    private String userId;

    @PositiveOrZero(message = "{userReview.bookId.positiveornotzero}")
    private Long bookId;

    @PositiveOrZero(message = "{userReview.rating.positiveornotzero}")
    private Integer rating;

    @NotBlank(message = "{userReview.reviewText.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.reviewText.size}")
    private String reviewText;

    @NotBlank(message = "{userReview.reviewTitle.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.reviewTitle.size}")
    private String reviewTitle;

    @NotNull(message = "{userReview.reviewDate.notnull}")
    private Date reviewDate;

    @PositiveOrZero(message = "{userReview.helpfulCount.positiveornotzero}")
    private Integer helpfulCount;

    private Boolean flagged;

    @NotBlank(message = "{userReview.flaggedReason.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.flaggedReason.size}")
    private String flaggedReason;

    @PositiveOrZero(message = "{userReview.responseCount.positiveornotzero}")
    private Integer responseCount;

    @NotNull(message = "{userReview.updatedAt.notnull}")
    private Date updatedAt;

    @NotNull(message = "{userReview.userRecommendation.notnull}")
    private Boolean userRecommendation;

    @NotBlank(message = "{userReview.readStatus.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.readStatus.size}")
    private String readStatus;

    @NotNull(message = "{userReview.readDate.notnull}")
    private Date readDate;

    @NotBlank(message = "{userReview.userLocation.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.userLocation.size}")
    private String userLocation;

    @NotNull(message = "{userReview.spoilerFlag.notnull}")
    private Boolean spoilerFlag;

    @NotBlank(message = "{userReview.responseFromLibrarian.notblank}")
    @Size(min = 3, max = 255, message = "{userReview.responseFromLibrarian.size}")
    private String responseFromLibrarian;

    @NotNull(message = "{userReview.anonymousReview.notnull}")
    private Boolean anonymousReview;

    public @NotBlank(message = "{userReview.userId.notblank}") @Size(min = 3, max = 255, message = "{userReview.userId.size}") String getUserId() {
        return userId;
    }

    public void setUserId(@NotBlank(message = "{userReview.userId.notblank}") @Size(min = 3, max = 255, message = "{userReview.userId.size}") String userId) {
        this.userId = userId;
    }

    public @PositiveOrZero(message = "{userReview.bookId.positiveornotzero}") Long getBookId() {
        return bookId;
    }

    public void setBookId(@PositiveOrZero(message = "{userReview.bookId.positiveornotzero}") Long bookId) {
        this.bookId = bookId;
    }

    public @PositiveOrZero(message = "{userReview.rating.positiveornotzero}") Integer getRating() {
        return rating;
    }

    public void setRating(@PositiveOrZero(message = "{userReview.rating.positiveornotzero}") Integer rating) {
        this.rating = rating;
    }

    public @NotBlank(message = "{userReview.reviewText.notblank}") @Size(min = 3, max = 255, message = "{userReview.reviewText.size}") String getReviewText() {
        return reviewText;
    }

    public void setReviewText(@NotBlank(message = "{userReview.reviewText.notblank}") @Size(min = 3, max = 255, message = "{userReview.reviewText.size}") String reviewText) {
        this.reviewText = reviewText;
    }

    public @NotBlank(message = "{userReview.reviewTitle.notblank}") @Size(min = 3, max = 255, message = "{userReview.reviewTitle.size}") String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(@NotBlank(message = "{userReview.reviewTitle.notblank}") @Size(min = 3, max = 255, message = "{userReview.reviewTitle.size}") String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public @NotNull(message = "{userReview.reviewDate.notnull}") Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(@NotNull(message = "{userReview.reviewDate.notnull}") Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public @PositiveOrZero(message = "{userReview.helpfulCount.positiveornotzero}") Integer getHelpfulCount() {
        return helpfulCount;
    }

    public void setHelpfulCount(@PositiveOrZero(message = "{userReview.helpfulCount.positiveornotzero}") Integer helpfulCount) {
        this.helpfulCount = helpfulCount;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public @NotBlank(message = "{userReview.flaggedReason.notblank}") @Size(min = 3, max = 255, message = "{userReview.flaggedReason.size}") String getFlaggedReason() {
        return flaggedReason;
    }

    public void setFlaggedReason(@NotBlank(message = "{userReview.flaggedReason.notblank}") @Size(min = 3, max = 255, message = "{userReview.flaggedReason.size}") String flaggedReason) {
        this.flaggedReason = flaggedReason;
    }

    public @PositiveOrZero(message = "{userReview.responseCount.positiveornotzero}") Integer getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(@PositiveOrZero(message = "{userReview.responseCount.positiveornotzero}") Integer responseCount) {
        this.responseCount = responseCount;
    }

    public @NotNull(message = "{userReview.updatedAt.notnull}") Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@NotNull(message = "{userReview.updatedAt.notnull}") Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public @NotNull(message = "{userReview.userRecommendation.notnull}") Boolean getUserRecommendation() {
        return userRecommendation;
    }

    public void setUserRecommendation(@NotNull(message = "{userReview.userRecommendation.notnull}") Boolean userRecommendation) {
        this.userRecommendation = userRecommendation;
    }

    public @NotBlank(message = "{userReview.readStatus.notblank}") @Size(min = 3, max = 255, message = "{userReview.readStatus.size}") String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(@NotBlank(message = "{userReview.readStatus.notblank}") @Size(min = 3, max = 255, message = "{userReview.readStatus.size}") String readStatus) {
        this.readStatus = readStatus;
    }

    public @NotNull(message = "{userReview.readDate.notnull}") Date getReadDate() {
        return readDate;
    }

    public void setReadDate(@NotNull(message = "{userReview.readDate.notnull}") Date readDate) {
        this.readDate = readDate;
    }

    public @NotBlank(message = "{userReview.userLocation.notblank}") @Size(min = 3, max = 255, message = "{userReview.userLocation.size}") String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(@NotBlank(message = "{userReview.userLocation.notblank}") @Size(min = 3, max = 255, message = "{userReview.userLocation.size}") String userLocation) {
        this.userLocation = userLocation;
    }

    public @NotNull(message = "{userReview.spoilerFlag.notnull}") Boolean getSpoilerFlag() {
        return spoilerFlag;
    }

    public void setSpoilerFlag(@NotNull(message = "{userReview.spoilerFlag.notnull}") Boolean spoilerFlag) {
        this.spoilerFlag = spoilerFlag;
    }

    public @NotBlank(message = "{userReview.responseFromLibrarian.notblank}") @Size(min = 3, max = 255, message = "{userReview.responseFromLibrarian.size}") String getResponseFromLibrarian() {
        return responseFromLibrarian;
    }

    public void setResponseFromLibrarian(@NotBlank(message = "{userReview.responseFromLibrarian.notblank}") @Size(min = 3, max = 255, message = "{userReview.responseFromLibrarian.size}") String responseFromLibrarian) {
        this.responseFromLibrarian = responseFromLibrarian;
    }

    public @NotNull(message = "{userReview.anonymousReview.notnull}") Boolean getAnonymousReview() {
        return anonymousReview;
    }

    public void setAnonymousReview(@NotNull(message = "{userReview.anonymousReview.notnull}") Boolean anonymousReview) {
        this.anonymousReview = anonymousReview;
    }
}
