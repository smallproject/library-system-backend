package nl.smallproject.www.librarysystembackend.helpers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.stream.Collectors;

public class AuthenticationHelper {
    public AuthenticationHelper() {
    }

    public String getAuthenticationText(Authentication authentication){

        return authentication.getPrincipal().toString() + " - Authorities: " + getAuthoritiesAsString(authentication) ;
    }

    public String getAuthoritiesAsString(Authentication authentication) {
        return authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));
    }
}
