package com.example.mana.client.user;

import com.example.mana.service.user.entity.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class UserSecurity extends User implements UserDetails {
    private Collection<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return expire;
    }

    @Override
    public boolean isAccountNonLocked() {
        return locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return deleteed;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }
}
