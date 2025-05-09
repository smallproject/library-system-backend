package nl.smallproject.www.librarysystembackend.config;

import nl.smallproject.www.librarysystembackend.security.JwtRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, JwtRequestFilter jwtRequestFilter) throws Exception {
        http
                .httpBasic(hp -> hp.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/login").permitAll()
                        .requestMatchers("/api/v1/books/search").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/v1/books").authenticated()
                        .requestMatchers(HttpMethod.GET,"/api/v1/books/*").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/v1/books/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.PUT, "/api/v1/books/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/books/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/authors").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/authors/*").authenticated()

                        .requestMatchers(HttpMethod.POST, "/api/v1/authors/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.PUT, "/api/v1/authors/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/authors/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")

                        .requestMatchers(HttpMethod.GET,"/api/v1/inventories").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/inventories/*").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.POST, "/api/v1/inventories/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.PUT, "/api/v1/inventories/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/inventories/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")

                        .requestMatchers(HttpMethod.GET,"/api/v1/reservations").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/reservations/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.POST, "/api/v1/reservations/**").authenticated()
                        .requestMatchers(HttpMethod.PUT, "/api/v1/reservations/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/reservations/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")

                        .requestMatchers(HttpMethod.GET,"/api/v1/users").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/users/*").authenticated()
                        .requestMatchers(HttpMethod.POST, "/api/v1/users/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.PUT, "/api/v1/users/**").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/users/**").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/users/photo/*").authenticated()

                        .requestMatchers(HttpMethod.GET, "/api/v1/userreviews/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/v1/userreviews/**").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/api/v1/userreviews/**").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/userreviews/**").hasAnyRole("ADMIN","LIBRARY_STAFF")

                        .requestMatchers(HttpMethod.GET,"/api/v1/addresses").hasAnyRole("ADMIN", "LIBRARY_STAFF")
                        .requestMatchers(HttpMethod.GET,"/api/v1/addresses/*").authenticated()
                        .requestMatchers(HttpMethod.POST, "/api/v1/addresses/**").authenticated()

                        .anyRequest().denyAll()
                )
                .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
                .csrf(csrf -> csrf.disable())
                .cors(cors -> {})
                .sessionManagement( session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        ;
        return  http.build();
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http, PasswordEncoder encoder, UserDetailsService apiUserDetailsService) throws Exception {
        var builder = http.getSharedObject(AuthenticationManagerBuilder.class);
        builder.userDetailsService(apiUserDetailsService).passwordEncoder(encoder);
        return builder.build();
    }
}
