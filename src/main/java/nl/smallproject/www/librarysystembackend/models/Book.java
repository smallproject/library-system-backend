package nl.smallproject.www.librarysystembackend.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

//@Data
@Entity(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

//    this needs relation
//    private List<Author> authors;


    @Column(name = "publicationdate")
    private Date publicationDate;

    @Column(name = "genre")
    private String genre;

    @Column(name = "pagecount")
    private Integer pagecount;

    @Column(name = "language")
    private String language;

    @Column(name = "coverimageurl")
    private String coverImageUrl;

    @Column(name = "descriptionsummary")
    private String descriptionsummary;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "copiesavailable")
    private Integer copiesAvailable;

    @Column(name = "dateadded")
    private Date dateAdded;

    @Column(name = "status")
    private String status;

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
}
