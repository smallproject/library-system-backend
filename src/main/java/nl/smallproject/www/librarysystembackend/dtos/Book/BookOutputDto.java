package nl.smallproject.www.librarysystembackend.dtos.Book;

import nl.smallproject.www.librarysystembackend.dtos.Inventory.InventoryOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewOutputDto;

import java.util.Date;
import java.util.List;

public class BookOutputDto {
    private Long id;

    private String isbn;

    private String title;

    private Date publicationDate;

    private String genre;

    private Integer pagecount;

    private String language;

    private String coverImageUrl;

    private String descriptionsummary;

    private Double rating;

    private Integer copiesAvailable;

    private Date dateAdded;

    private String status;

    private List<UserReviewOutputDto> userReviewOutputDtos;

    private List<InventoryOutputDto> inventoryOutputDtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPagecount() {
        return pagecount;
    }

    public void setPagecount(Integer pagecount) {
        this.pagecount = pagecount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getDescriptionsummary() {
        return descriptionsummary;
    }

    public void setDescriptionsummary(String descriptionsummary) {
        this.descriptionsummary = descriptionsummary;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(Integer copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UserReviewOutputDto> getUserReviewOutputDtos() {
        return userReviewOutputDtos;
    }

    public void setUserReviewOutputDtos(List<UserReviewOutputDto> userReviewOutputDtos) {
        this.userReviewOutputDtos = userReviewOutputDtos;
    }

    public List<InventoryOutputDto> getInventoryOutputDtos() {
        return inventoryOutputDtos;
    }

    public void setInventoryOutputDtos(List<InventoryOutputDto> inventoryOutputDtos) {
        this.inventoryOutputDtos = inventoryOutputDtos;
    }

}
