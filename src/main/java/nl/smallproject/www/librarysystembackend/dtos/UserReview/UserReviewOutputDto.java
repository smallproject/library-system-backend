package nl.smallproject.www.librarysystembackend.dtos.UserReview;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class UserReviewOutputDto {
    private Long id;

    private String userId;

    private Long bookId;

    private Integer rating;

    private String reviewText;

    private String reviewTitle;

    private Date reviewDate;

    private Integer helpfulCount;

    private Boolean flagged;

    private String flaggedReason;

    private Integer responseCount;

    private Date updatedAt;

    private Boolean userRecommendation;

    private String readStatus;

    private Date readDate;

    private String userLocation;

    private Boolean spoilerFlag;

    private String responseFromLibrarian;

    private Boolean anonymousReview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Integer getHelpfulCount() {
        return helpfulCount;
    }

    public void setHelpfulCount(Integer helpfulCount) {
        this.helpfulCount = helpfulCount;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public String getFlaggedReason() {
        return flaggedReason;
    }

    public void setFlaggedReason(String flaggedReason) {
        this.flaggedReason = flaggedReason;
    }

    public Integer getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(Integer responseCount) {
        this.responseCount = responseCount;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getUserRecommendation() {
        return userRecommendation;
    }

    public void setUserRecommendation(Boolean userRecommendation) {
        this.userRecommendation = userRecommendation;
    }

    public String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public Boolean getSpoilerFlag() {
        return spoilerFlag;
    }

    public void setSpoilerFlag(Boolean spoilerFlag) {
        this.spoilerFlag = spoilerFlag;
    }

    public String getResponseFromLibrarian() {
        return responseFromLibrarian;
    }

    public void setResponseFromLibrarian(String responseFromLibrarian) {
        this.responseFromLibrarian = responseFromLibrarian;
    }

    public Boolean getAnonymousReview() {
        return anonymousReview;
    }

    public void setAnonymousReview(Boolean anonymousReview) {
        this.anonymousReview = anonymousReview;
    }
}
