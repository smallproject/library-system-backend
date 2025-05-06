package nl.smallproject.www.librarysystembackend.controllers;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserChangePassWordRequestDTO;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserRequestDTO;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserUpdateDto;
import nl.smallproject.www.librarysystembackend.entities.User;
import nl.smallproject.www.librarysystembackend.helpers.UrlHelper;
import nl.smallproject.www.librarysystembackend.mappers.UserDTOMapper;
import nl.smallproject.www.librarysystembackend.services.ApiUserDetailService;
import nl.smallproject.www.librarysystembackend.services.PhotoService;
import nl.smallproject.www.librarysystembackend.services.UserService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Objects;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserDTOMapper userDTOMapper;
    private final ApiUserDetailService apiUserDetailService;
    private final HttpServletRequest request;
    private final UserService userService;
    private final PhotoService photoService;

    public UserController(UserDTOMapper userDTOMapper, ApiUserDetailService apiUserDetailService, HttpServletRequest request, UserService userService, PhotoService photoService) {
        this.userDTOMapper = userDTOMapper;
        this.apiUserDetailService = apiUserDetailService;
        this.request = request;
        this.userService = userService;
        this.photoService = photoService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> CreateUser(@RequestBody @Valid UserRequestDTO userDTO)
    {
        var userModel = userDTOMapper.mapToModel(userDTO);
        userModel.setEnabled(true);
        if(!apiUserDetailService.createUser(userModel, userDTO.getRoles())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(UrlHelper.getCurrentUrlWithId(request, userModel.getId())).build();
    }

    @RequestMapping(value ="{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> ChangePassword(@PathVariable Long id, @RequestBody @Valid UserChangePassWordRequestDTO userDTO)
    {
        var userModel = userDTOMapper.mapToModel(userDTO, id);
        if(!apiUserDetailService.updatePassword(userModel)) {
            return ResponseEntity.badRequest().build();
        }
        return  ResponseEntity.ok().build();
    }

    @RequestMapping(value = "{username}", method = RequestMethod.GET)
    public ResponseEntity<UserOutputDto> getUserByUsername(@PathVariable String username) {
        UserOutputDto userOutputDto = userService.getUserByUsername(username);
        return ResponseEntity.ok(userOutputDto);
    }

    @RequestMapping(value = "/profile/{username}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUserProfile(@PathVariable String username, @Valid @RequestBody final UserUpdateDto userUpdateDto) {
        userService.updateProfile(username, userUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserOutputDto>> getAllUsers() {
        List<UserOutputDto> userOutputDtos = userService.getAllUsers();
        return ResponseEntity.ok(userOutputDtos);
    }


    @PostMapping("/photo/{id}")
    public ResponseEntity<User> addPhotoToUser(@PathVariable("id") Long userId,
                                                  @RequestBody MultipartFile file)
            throws IOException {
        String url = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/users/")
                .path(Objects.requireNonNull(userId.toString()))
                .path("/photo")
                .toUriString();
        String fileName = photoService.storeFile(file);
        User user = userService.assignPhotoToUser(fileName, userId);

        return ResponseEntity.created(URI.create(url)).body(user);

    }

    @GetMapping("/photo/{id}")
    public ResponseEntity<Resource> getUserPhoto(@PathVariable("id") Long userId, HttpServletRequest request){
        Resource resource = userService.getPhotoFromUser(userId);

        String mimeType;

        try{
            mimeType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException e) {
            mimeType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }

        return ResponseEntity
                .ok()
                .contentType(MediaType.parseMediaType(mimeType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline;fileName=" + resource.getFilename())
                .body(resource);
    }

}
