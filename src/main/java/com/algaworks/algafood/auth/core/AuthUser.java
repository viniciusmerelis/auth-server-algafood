package com.algaworks.algafood.auth.core;

import com.algaworks.algafood.auth.domain.Usuario;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Collections;

@Getter
public class AuthUser extends User {
    private Long userId;
    private String fullName;
    public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getEmail(), usuario.getSenha(), authorities);
        this.userId = usuario.getId();
        this.fullName = usuario.getNome();
    }
}
