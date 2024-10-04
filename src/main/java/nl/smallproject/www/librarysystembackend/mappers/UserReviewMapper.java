package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.UserReviewInputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import org.springframework.stereotype.Component;

@Component
public class UserReviewMapper {
    public UserReviewOutputDto userReviewEntityToOutputDto(UserReview userReview) {
        UserReviewOutputDto userReviewOutputDto = new UserReviewOutputDto();
        userReviewOutputDto.setId(userReview.getId());
        userReviewOutputDto.setUserId(userReview.getUserId());
        userReviewOutputDto.setRating(userReview.getRating());
        userReviewOutputDto.setComments(userReview.getComments());
        return userReviewOutputDto;
    }

    public UserReview userReviewInputDtoToEntity(UserReviewInputDto userReviewInputDto) {
        UserReview userReview = new UserReview();
        userReview.setUserId(userReviewInputDto.getUserId());
        userReview.setRating(userReviewInputDto.getRating());
        userReview.setComments(userReviewInputDto.getComments());
        return userReview;
    }
}
