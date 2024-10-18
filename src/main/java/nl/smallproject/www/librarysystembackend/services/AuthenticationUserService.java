package nl.smallproject.www.librarysystembackend.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationUserService implements UserDetailsService {
    private final PasswordEncoder passwordEncoder;

    public AuthenticationUserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return switch (username) {
            case "admin" -> User.builder()
                    .username("admin")
                    .password(passwordEncoder.encode("adminpassword"))
                    .roles("ADMIN")
                    .build();
            case "user" -> User.builder()
                    .username("user")
                    .password(passwordEncoder.encode("password"))
                    .roles("USER")
                    .build();
            default -> throw new UsernameNotFoundException("User not found");
        };
    }
}
