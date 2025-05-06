package nl.smallproject.www.librarysystembackend.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "userreviews")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "reviewtext")
    private String reviewText;

    @Column(name = "reviewtitle")
    private String reviewTitle;

    @Column(name = "reviewdate")
    private Date reviewDate;

    @Column(name = "helpfulcount")
    private Integer helpfulCount;

    @Column(name = "flagged")
    private Boolean flagged;

    @Column(name = "flaggedreason")
    private String flaggedReason;

    @Column(name = "responsecount")
    private Integer responseCount;

    @Column(name = "updatedat")
    private Date updatedAt;

    @Column(name = "userrecommendation")
    private Boolean userRecommendation;

    @Column(name = "readstatus")
    private String readStatus;

    @Column(name = "readdate")
    private Date readDate;

    @Column(name = "userlocation")
    private String userLocation;

    @Column(name = "spoilerflag")
    private Boolean spoilerFlag;

    @Column(name = "responsefromlibrarian")
    private String responseFromLibrarian;

    @Column(name = "anonymousreview")
    private Boolean anonymousReview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
