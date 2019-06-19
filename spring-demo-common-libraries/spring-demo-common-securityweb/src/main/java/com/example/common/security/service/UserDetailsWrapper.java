package com.example.common.security.service;

import com.example.common.entity.security.Authority;
import com.example.common.entity.security.User;
import com.example.common.service.security.auth.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserDetailsWrapper extends User implements UserDetails {
    @Autowired
    AuthorityService authorityInf;
    private Collection<GrantedAuthority> authWrapper = Collections.emptyList();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authWrapper;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.expire;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.expire;
    }

    @Override
    public boolean isEnabled() {
        return this.enable;
    }

    public UserDetailsWrapper buildAuth() {
        Collection<Authority> auth = authorityInf.obtainByUname(this.name);
        if (auth != null && auth.size() > 0)
            this.authWrapper = new ArrayList<>();
        for (Authority a : auth) {
            SimpleGrantedAuthority e
                    = new SimpleGrantedAuthority(a.getCode());
            authWrapper.add(e);
        }
        return this;
    }
}
