package nl.smallproject.www.librarysystembackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.librarysystembackend.mappers.UserMapper;
import nl.smallproject.www.librarysystembackend.models.UserModel;
import nl.smallproject.www.librarysystembackend.models.UserPhoto;
import nl.smallproject.www.librarysystembackend.repositories.FileUploadRepository;
import nl.smallproject.www.librarysystembackend.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final ApiUserDetailService service;
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final FileUploadRepository uploadRepository;
    private final PhotoService photoService;

    public UserService(ApiUserDetailService service, UserMapper userMapper, UserRepository userRepository, FileUploadRepository uploadRepository, PhotoService photoService) {
        this.service = service;
        this.userMapper = userMapper;
        this.userRepository = userRepository;
        this.uploadRepository = uploadRepository;
        this.photoService = photoService;
    }

    public UserOutputDto getUserByUsername(String username) {
        Optional<UserModel> userOptional = Optional.ofNullable(service.getUserByUserName(username)
                .orElseThrow(() -> new RecordNotFoundException("User not found with this username" + username)));

        if (userOptional.isPresent()) {
            UserModel user = userOptional.get();
            return userMapper.toUserOutputDto(user);
        } else {
            throw new RecordNotFoundException("User not found with this username: " + username);
        }
    }

    @Transactional
    public void updateProfile(String username, UserUpdateDto userUpdateDto) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        User existingUser;
        if (userOptional.isPresent()){
            existingUser = userOptional.get();
        } else {
            throw new RecordNotFoundException("User not found with this username: " + username);
        }

        String[] ignoreProperties = {"id", "username", "password", "roles", "isExpired", "isLocked", "areCredentialsExpired", "isEnabled"};
        User updatedUser = userMapper.userUpdatedDtoToEntity(userUpdateDto);
        BeanUtils.copyProperties(updatedUser,  existingUser, ignoreProperties);
        userRepository.save(existingUser);
    }

    public List<UserOutputDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserOutputDto> userOutputDtos = new ArrayList<>();

        for (var user : users) {
            userOutputDtos.add(userMapper.toUserOutputDto(user));
        }
        return userOutputDtos;
    }

    @Transactional
    public User assignPhotoToUser(String fileName, Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<UserPhoto> optionalPhoto = uploadRepository.findByFileName(fileName);

        if (optionalUser.isPresent() && optionalPhoto.isPresent()) {
            UserPhoto photo = optionalPhoto.get();
            User user = optionalUser.get();
            user.setUserPhoto(photo);
            return userRepository.save(user);
        } else {
            throw new RecordNotFoundException("student of foto niet gevonden");
        }
    }

    @Transactional
    public Resource getPhotoFromUser(Long userId) {
        Optional<User> optionalStudent = userRepository.findById(userId);
        if(optionalStudent.isEmpty()){
            throw new RecordNotFoundException("Student with student number " + userId + " not found.");
        }
        UserPhoto photo = optionalStudent.get().getUserPhoto();
        if(photo == null){
            throw new RecordNotFoundException("Student " + userId + " had no photo.");
        }
        return photoService.downLoadFile(photo.getFileName());
    }
}
