package com.app.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailDto extends User {

    public UserDetailDto(String username,
                         String password,
                         Collection<? extends GrantedAuthority> authorities) {
        super(username, password,  authorities);
    }
}
