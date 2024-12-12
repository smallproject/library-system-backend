package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewInputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.UserReview.UserReviewUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserReviewMapper;
import nl.smallproject.www.librarysystembackend.models.Book;
import nl.smallproject.www.librarysystembackend.models.UserReview;
import nl.smallproject.www.librarysystembackend.repositories.BookRepository;
import nl.smallproject.www.librarysystembackend.repositories.UserRepository;
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
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public UserReviewService(UserReviewRepository userReviewRepository, UserReviewMapper userReviewMapper, BookRepository bookRepository, UserRepository userRepository) {
        this.userReviewRepository = userReviewRepository;
        this.userReviewMapper = userReviewMapper;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
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

    @Transactional
    public UserReview createUserReview(UserReviewInputDto userReviewInputDto) {
        Optional<Book> bookOptional = bookRepository.findById(userReviewInputDto.getBookId());
        if (bookOptional.isEmpty()) {
            return null;
        }
        Book book = bookOptional.get();

        UserReview userReview = userReviewMapper.userReviewInputDtoToEntity(userReviewInputDto, book);
        return userReviewRepository.save(userReview);
    }

    @Transactional
    public void updateUserReview(Long id, UserReviewUpdateDto userReviewUpdateDto) {
        Optional<UserReview> userReviewOptional = Optional.ofNullable(userReviewRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User review not found with this id: " + id)));

        if(userReviewOptional.isEmpty()) {
            return;
        }
        UserReview existingUserReview = userReviewOptional.get();

        Optional<Book> bookOptional = bookRepository.findById(userReviewUpdateDto.getBookId());
        if (bookOptional.isEmpty()) {
            return;
        }
        Book book = bookOptional.get();

        Optional<User> userOptional = userRepository.findById(userReviewUpdateDto.getUserId());
        if (userOptional.isEmpty())
        {
            return;
        }
        User user = userOptional.get();


        UserReview updatedUserReview = userReviewMapper.userReviewUpdateDtoToEntity(userReviewUpdateDto, book);

        BeanUtils.copyProperties(updatedUserReview, existingUserReview, "id");
        userReviewRepository.save(existingUserReview);
    }

    @Transactional
    public void deleteUserReview(Long id) {
        userReviewRepository.deleteById(id);
    }

    public List<UserReviewOutputDto> getUserReviewsByBookId(Long bookId) {
        List<UserReview> userReviews = userReviewRepository.findAllByBookId(bookId);

        List<UserReviewOutputDto> userReviewOutputDtos = new ArrayList<>();

        for (var userReview: userReviews) {
            userReviewOutputDtos.add(userReviewMapper.userReviewEntityToOutputDto(userReview));
        }
        return  userReviewOutputDtos;
    }
}
