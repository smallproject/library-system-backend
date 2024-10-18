package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.User.UserInputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserOutputDto userEntityToOutputDto(User user) {
        UserOutputDto userOutputDto = new UserOutputDto();
        userOutputDto.setId(user.getId());
        userOutputDto.setUsername(user.getUsername());
        userOutputDto.setEmail(user.getEmail());
        userOutputDto.setPasswordHash(user.getPasswordHash());
        userOutputDto.setCreatedAt(user.getCreatedAt());
        userOutputDto.setUpdatedAt(user.getUpdatedAt());
        return userOutputDto;
    }

    public User userInputDtoToEntity(UserInputDto userInputDto) {
        User user = new User();
        user.setUsername(userInputDto.getUsername());
        user.setEmail(userInputDto.getEmail());
        user.setPasswordHash(userInputDto.getPasswordHash());
        user.setCreatedAt(userInputDto.getCreatedAt());
        user.setUpdatedAt(userInputDto.getUpdatedAt());
        return user;
    }

    public User userUpdateDtoToEntity(UserUpdateDto userUpdateDto) {
        User user = new User();
        user.setUsername(userUpdateDto.getUsername());
        user.setEmail(userUpdateDto.getEmail());
        user.setPasswordHash(userUpdateDto.getPasswordHash());
        user.setCreatedAt(userUpdateDto.getCreatedAt());
        user.setUpdatedAt(userUpdateDto.getUpdatedAt());
        return user;
    }
}
