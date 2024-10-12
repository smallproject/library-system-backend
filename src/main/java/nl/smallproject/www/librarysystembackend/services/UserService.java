package nl.smallproject.www.librarysystembackend.services;

import nl.smallproject.www.librarysystembackend.dtos.User.UserInputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserMapper;
import nl.smallproject.www.librarysystembackend.models.User;
import nl.smallproject.www.librarysystembackend.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserOutputDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserOutputDto> userOutputDtos = new ArrayList<>();

        for (User user : users) {
            userOutputDtos.add(userMapper.userEntityToOutputDto(user));
        }
        return  userOutputDtos;
    }

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

    public User createUser(UserInputDto userInputDto) {
        User user = userMapper.userInputDtoToEntity(userInputDto);
        return userRepository.save(user);
    }

    public void updateUser(Long id, UserUpdateDto userUpdateDto) {
        User existingUser = userRepository.getReferenceById(id);
        User updatedUser = userMapper.userUpdateDtoToEntity(userUpdateDto);
        BeanUtils.copyProperties(updatedUser, existingUser, "id");
        userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
