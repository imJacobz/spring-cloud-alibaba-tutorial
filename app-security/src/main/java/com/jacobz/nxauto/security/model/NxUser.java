package com.jacobz.nxauto.security.model;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class NxUser extends User {

    private final Integer id;
    private final String email;

    public NxUser(Integer id, String username, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
        this.email = email;
    }
}
