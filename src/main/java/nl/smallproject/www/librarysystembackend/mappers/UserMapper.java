package nl.smallproject.www.librarysystembackend.mappers;


import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.models.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserMapper{

    private final RoleMapper roleMapper;

    private final PasswordEncoder passwordEncoder;

    public UserMapper(RoleMapper roleMapper, PasswordEncoder passwordEncoder) {
        this.roleMapper = roleMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public UserModel fromEntity(User entity) {
        if (entity == null) {
            return null;
        }
        UserModel model = new UserModel(entity.getId());
        model.setPassword(entity.getPassword());
        model.setUsername(entity.getUsername());
        model.areCredentialsExpired(entity.areCredentialsExpired());
        model.setEnabled(entity.isEnabled());
        model.setExpired(entity.isExpired());
        model.setLocked(entity.isLocked());
        model.setRoles(roleMapper.fromEntities(entity.getRoles()));

        model.setName(entity.getName());
        model.setBio(entity.getBio());
        model.setLocation(entity.getLocation());
        model.setEmail(entity.getEmail());
        return model;
    }

    public User toEntity(UserModel model) {
        if (model == null) {
            return null;
        }
        User entity = new User(model.getId());
        entity.setPassword(passwordEncoder.encode(model.getPassword()));
        entity.setUsername(model.getUsername());
        entity.setAreCredentialsExpired(model.areCredentialsExpired());
        entity.setEnabled(model.isEnabled());
        entity.setExpired(model.isExpired());
        entity.setLocked(model.isLocked());
        entity.setRoles(roleMapper.toEntities(model.getRoles()));
        return entity;
    }


    public UserOutputDto toUserOutputDto(UserModel model) {
        if (model == null) {
            return null;
        }

        UserOutputDto outputDto = new UserOutputDto();
        outputDto.setId(model.getId());
        outputDto.setUsername(model.getUsername());
        outputDto.setPassword(model.getPassword());
        outputDto.setRoles(model.getRoleNames().toArray(new String[0]));
        outputDto.setName(model.getName());
        outputDto.setBio(model.getBio());
        outputDto.setLocation(model.getLocation());
        outputDto.setEmail(model.getEmail());

        return outputDto;
    }

    public UserOutputDto toUserOutputDto(User user) {
        if (user == null) {
            return null;
        }

        UserOutputDto outputDto = new UserOutputDto();
        outputDto.setId(user.getId());
        outputDto.setUsername(user.getUsername());
        outputDto.setPassword(user.getPassword());
        outputDto.setName(user.getName());
        outputDto.setBio(user.getBio());
        outputDto.setLocation(user.getLocation());
        outputDto.setEmail(user.getEmail());

        return outputDto;
    }

    public User userUpdatedDtoToEntity(UserUpdateDto userUpdateDto) {
        if (userUpdateDto == null) {
            return null;
        }

        User user = new User();
        user.setName(userUpdateDto.getName());
        user.setBio(userUpdateDto.getBio());
        user.setLocation(userUpdateDto.getLocation());
        user.setEmail(userUpdateDto.getEmail());

        return user;
    }
}

