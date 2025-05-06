package nl.smallproject.www.librarysystembackend.controllers;

import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewInputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewUpdateDto;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.services.UserReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/userreviews")
@CrossOrigin
public class UserReviewsController {
    private final UserReviewService userReviewService;

    public UserReviewsController(UserReviewService userReviewService) {
        this.userReviewService = userReviewService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserReviewOutputDto>> getAllUserReviews() {
        List<UserReviewOutputDto> userReviewOutputDtos = userReviewService.getAllUserReviews();
        return ResponseEntity.ok(userReviewOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<UserReviewOutputDto> getUserReviewById(@PathVariable Long id) {
        UserReviewOutputDto userReviewOutputDto = userReviewService.getUserReviewById(id);
        return  ResponseEntity.ok(userReviewOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createUserReview(@Valid @RequestBody final UserReviewInputDto userReviewInputDto) {
        UserReview newUserReview = userReviewService.createUserReview(userReviewInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newUserReview.getId())
                .buildAndExpand(newUserReview)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newUserReview);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUserReview(@PathVariable Long id, @Valid @RequestBody final UserReviewUpdateDto userReviewUpdateDto) {
        userReviewService.updateUserReview(id, userReviewUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        userReviewService.deleteUserReview(id);
        return ResponseEntity.noContent().build();
    }


    @RequestMapping(value = "books/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<UserReviewOutputDto>> getUserReviewByBookId(@PathVariable Long id) {
        List<UserReviewOutputDto> userReviewsOutputDto = userReviewService.getUserReviewsByBookId(id);
        return  ResponseEntity.ok(userReviewsOutputDto);
    }
}
