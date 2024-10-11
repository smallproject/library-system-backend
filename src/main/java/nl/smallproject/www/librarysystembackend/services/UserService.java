package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.User.UserInputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserOutputDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserMapper;
import nl.smallproject.www.librarysystembackend.models.User;
import nl.smallproject.www.librarysystembackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }
//
//    public User createUser(UserInputDto userInputDto) {
//
//    }

    public UserOutputDto getUserById(Long id) {
        Optional<User> userOptional = Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User not found with this id: " + id)));

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return userMapper.userEntityToOutputDto(user);
        } else {
            throw new RecordNotFoundException("User not found with this id: " +id);
        }
    }
}
