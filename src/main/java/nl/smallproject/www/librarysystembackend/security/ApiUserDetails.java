package nl.smallproject.www.librarysystembackend.security;

import nl.smallproject.www.librarysystembackend.models.RoleModel;
import nl.smallproject.www.librarysystembackend.models.UserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApiUserDetails implements UserDetails {

    private final UserModel user;
    private  String organisation = "";

    public ApiUserDetails(UserModel user) {
        this.user = user;
    }

    public ApiUserDetails(String username, List<String> roles, String organisation) {
        this.organisation = organisation;
        user = new UserModel();
        user.setUsername(username);

        for (String role : roles) {
            user.getRoles().add(new RoleModel(role));
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleModel role: user.getRoles()) {
            if(role.isActive()) {
                authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return  user.getId() + "::" + user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !user.isExpired();
    }
    @Override
    public boolean isAccountNonLocked() {
        return !user.isLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !user.areCredentialsExpired();
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }
}
