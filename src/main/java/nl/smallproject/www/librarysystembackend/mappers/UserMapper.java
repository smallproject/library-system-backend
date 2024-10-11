package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.User.UserOutputDto;
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
}
