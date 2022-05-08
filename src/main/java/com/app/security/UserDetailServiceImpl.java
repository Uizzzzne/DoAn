package com.app.security;

import com.app.dto.AccountDto;
import com.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountDto accountDto = accountService.findByEmail(username);

        if (accountDto == null){
            throw new UsernameNotFoundException("UsernameNotFoundException");
        }

        return new UserDetailDto(
                accountDto.getEmail(),
                accountDto.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(accountDto.getRoleName()))
        );
    }
}
