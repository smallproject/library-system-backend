package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.UserReviewRepository;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReviewService {
    private final UserReviewRepository userReviewRepository;

    public UserReviewService(UserReviewRepository userReviewRepository) {
        this.userReviewRepository = userReviewRepository;
    }

    public List<UserReview> getAllUserReviews() {
        return userReviewRepository.findAll();
    }

    public UserReview getUserReviewById(Long id) {
        return userReviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User review not found with this id: " +id));
    }

    public UserReview saveUserReview(UserReview userReview) {
        return userReviewRepository.save(userReview);
    }

    public void updateUserReview(Long id, UserReview userReview) {
        UserReview existingUserReview = userReviewRepository.getReferenceById(id);
        BeanUtils.copyProperties(userReview, existingUserReview, "id");
        userReviewRepository.save(existingUserReview);
    }

    public void deleteUserReview(Long id) {
        userReviewRepository.deleteById(id);
    }

}
