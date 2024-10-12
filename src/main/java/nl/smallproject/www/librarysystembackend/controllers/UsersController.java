package nl.smallproject.www.librarysystembackend.controllers;

import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.User.UserInputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.User.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.services.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserOutputDto>> getAllUsers() {
        List<UserOutputDto> userOutputDtos = userService.getAllUsers();
        return ResponseEntity.ok(userOutputDtos);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<UserOutputDto> getUserById(@PathVariable final Long id) {
        UserOutputDto userOutputDto = userService.getUserById(id);
        return ResponseEntity.ok(userOutputDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@Valid @RequestBody final UserInputDto userInputDto) {
        var newUser = userService.createUser(userInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newUser.getId())
                .buildAndExpand(newUser)
                .toUri();

        return  ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newUser);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@PathVariable final Long id,@Valid @RequestBody final UserUpdateDto userUpdateDto) {
        userService.updateUser(id, userUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteUser(@PathVariable final Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
