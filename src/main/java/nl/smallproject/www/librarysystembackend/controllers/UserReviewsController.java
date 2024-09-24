package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.UserReviewRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/userreviews")
public class UserReviewsController {
    @Autowired
    private UserReviewRepository userReviewsRepository;

    @GetMapping
    @RequestMapping("{id}")
    public UserReview get(@PathVariable Long id) {
        return userReviewsRepository.getReferenceById(id);
    }

    @PostMapping("/addUserReview")
    public UserReview create(@RequestBody final UserReview userReview) {
        return userReviewsRepository.saveAndFlush(userReview);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        userReviewsRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public UserReview update(@PathVariable Long id, @RequestBody UserReview userReview) {
        UserReview existingUserReview = userReviewsRepository.getReferenceById(id);
        BeanUtils.copyProperties(userReview, existingUserReview, "id");
        return userReviewsRepository.saveAndFlush(existingUserReview);
    }
}
