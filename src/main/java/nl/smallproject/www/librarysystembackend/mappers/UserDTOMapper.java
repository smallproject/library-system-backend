package nl.smallproject.www.librarysystembackend.mappers;


import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserChangePassWordRequestDTO;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserRequestDTO;
import nl.smallproject.www.librarysystembackend.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {



    public UserModel mapToModel(UserRequestDTO userDTO) {
        var result = new UserModel(-1L);
        result.setUsername(userDTO.getUsername());
        result.setPassword(userDTO.getPassword());
        return result;
    }

    public UserModel mapToModel(UserChangePassWordRequestDTO userDTO, Long id) {
        var result = new UserModel(id);
        result.setPassword(userDTO.getPassword());
        return result;
    }
}
