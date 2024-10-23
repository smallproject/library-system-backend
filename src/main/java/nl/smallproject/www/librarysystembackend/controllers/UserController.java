package nl.smallproject.www.librarysystembackend.controllers;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserChangePassWordRequestDTO;
import nl.smallproject.www.librarysystembackend.dtos.Authentication.UserRequestDTO;
import nl.smallproject.www.librarysystembackend.helpers.UrlHelper;
import nl.smallproject.www.librarysystembackend.mappers.UserDTOMapper;
import nl.smallproject.www.librarysystembackend.services.ApiUserDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserDTOMapper userDTOMapper;
    private final ApiUserDetailService apiUserDetailService;
    private final HttpServletRequest request;

    public UserController(UserDTOMapper userDTOMapper, ApiUserDetailService apiUserDetailService, HttpServletRequest request) {
        this.userDTOMapper = userDTOMapper;
        this.apiUserDetailService = apiUserDetailService;
        this.request = request;
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
}
