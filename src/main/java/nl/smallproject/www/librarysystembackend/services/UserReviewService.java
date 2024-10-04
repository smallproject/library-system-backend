package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserReviewMapper;
import nl.smallproject.www.librarysystembackend.models.Inventory;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.UserReviewRepository;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserReviewService {
    private final UserReviewRepository userReviewRepository;
    private final UserReviewMapper userReviewMapper;

    public UserReviewService(UserReviewRepository userReviewRepository, UserReviewMapper userReviewMapper) {
        this.userReviewRepository = userReviewRepository;
        this.userReviewMapper = userReviewMapper;
    }

    public List<UserReview> getAllUserReviews() {
        return userReviewRepository.findAll();
    }

    public UserReviewOutputDto getUserReviewById(Long id) {
        Optional<UserReview> userReviewOptional = Optional.ofNullable(userReviewRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User review not found with this id: " + id)));
        if (userReviewOptional.isPresent()) {
            UserReview userReview = userReviewOptional.get();
            return userReviewMapper.userReviewEntityToOutputDto(userReview);
        } else {
            throw new RecordNotFoundException("User review not found with this id: " +id);
        }
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
