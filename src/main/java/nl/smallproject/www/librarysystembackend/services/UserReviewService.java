package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewInputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewUpdateDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserReviewMapper;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.UserReviewRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<UserReviewOutputDto> getAllUserReviews() {
        List<UserReview> userReviews = userReviewRepository.findAll();
        List<UserReviewOutputDto> userReviewOutputDtos = new ArrayList<>();

        for (var userReview: userReviews) {
            userReviewOutputDtos.add(userReviewMapper.userReviewEntityToOutputDto(userReview));
        }
        return  userReviewOutputDtos;
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

    public UserReview createUserReview(UserReviewInputDto userReviewInputDto) {
        UserReview userReview = userReviewMapper.userReviewInputDtoToEntity(userReviewInputDto);
        return userReviewRepository.save(userReview);
    }

    public void updateUserReview(Long id, UserReviewUpdateDto userReviewUpdateDto) {
        UserReview existingUserReview = userReviewRepository.getReferenceById(id);
        UserReview updatedUserReview = userReviewMapper.userReviewUpdateDtoToEntity(userReviewUpdateDto);

        BeanUtils.copyProperties(updatedUserReview, existingUserReview, "id");
        userReviewRepository.save(existingUserReview);
    }

    public void deleteUserReview(Long id) {
        userReviewRepository.deleteById(id);
    }

}
