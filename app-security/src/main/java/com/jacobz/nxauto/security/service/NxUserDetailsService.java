package com.jacobz.nxauto.security.service;

import com.jacobz.nxauto.mapper.UserMapper;
import com.jacobz.nxauto.security.model.NxUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NxUserDetailsService implements UserDetailsService {

    private final UserMapper mapper;

    public NxUserDetailsService(@Autowired(required = false) UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var sysUser = mapper.selectByUsernameOrEmail(username);
        if (sysUser == null) {
            throw new BadCredentialsException("Incorrect username or password");
        }

        // Customize authority
        Set<GrantedAuthority> authorities = new HashSet<>();
        if (sysUser.getRoles() != null && !sysUser.getRoles().isEmpty()) {
            sysUser.getRoles().forEach(r -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(r.getRoleName());
                authorities.add(grantedAuthority);
            });
        }
        // return authorization UserDetails with extra fields.
        return new NxUser(sysUser.getId(),
                sysUser.getUsername(), sysUser.getEmail(),
                sysUser.getPassword(), authorities);

    }
}
