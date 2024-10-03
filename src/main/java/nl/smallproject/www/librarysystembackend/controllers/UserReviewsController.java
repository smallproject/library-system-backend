package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.services.UserReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/userreviews")
public class UserReviewsController {
    private final UserReviewService userReviewService;

    public UserReviewsController(UserReviewService userReviewService) {
        this.userReviewService = userReviewService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserReview>> getAllUserReviews() {
        List<UserReview> userReviews = userReviewService.getAllUserReviews();
        return ResponseEntity.ok(userReviews);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserReview> getUserReviewById(@PathVariable Long id) {
        UserReview existingUserReview = userReviewService.getUserReviewById(id);
        return  ResponseEntity.ok(existingUserReview);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserReview> create(@RequestBody final UserReview userReview) {
        UserReview savedUserReview = userReviewService.saveUserReview(userReview);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUserReview);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserReview> update(@PathVariable Long id, @RequestBody UserReview userReview) {
        userReviewService.updateUserReview(id, userReview);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserReview> delete(@PathVariable Long id) {
        userReviewService.deleteUserReview(id);
        return ResponseEntity.noContent().build();
    }
}
