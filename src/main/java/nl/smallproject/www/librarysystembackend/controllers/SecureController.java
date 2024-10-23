package nl.smallproject.www.librarysystembackend.controllers;

import nl.smallproject.www.librarysystembackend.helpers.AuthenticationHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecureController {
    private Authentication authentication;

    private final AuthenticationHelper authenticationHelper = new AuthenticationHelper();

    private void setAuthentication(SecurityContext context) {
        this.authentication =context.getAuthentication();
    }

    @GetMapping("/secure")
    public ResponseEntity<String> getSecureData() {
        setAuthentication(SecurityContextHolder.getContext());
        return ResponseEntity.ok("Dit is beveiligde data: " + authenticationHelper.getAuthenticationText(authentication));
    }

    @GetMapping("/secure/admin")
    public ResponseEntity<String> getAdminData() {
        setAuthentication(SecurityContextHolder.getContext());
        return ResponseEntity.ok("Dit is beveiligde admin data: " + authenticationHelper.getAuthenticationText(authentication));
    }

    @GetMapping("/secure/user")
    public ResponseEntity<String> getUserData() {
        setAuthentication(SecurityContextHolder.getContext());
        return ResponseEntity.ok("Dit is beveiligde user data: " +  authenticationHelper.getAuthenticationText(authentication));
    }

}
