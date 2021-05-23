package ru.mirea.ikbo1319.LanguageSchool2.entity;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "t_user")
@Getter
@Setter
public class Users {                //implements UserDetails
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Логин не должен быть пустым")
    private String username;

    @NotBlank(message = "Пароль не должен быть пустым")
    private String password;

    private boolean active;

    @Transient
    @NotBlank(message = "Поле пдтверждение пароля не должно быть пустым")
    private String passwordConfirm;

    //@ManyToMany(fetch = FetchType.EAGER)
    //private Set<Roles> roles;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name="t_roles", joinColumns = @JoinColumn(name="user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public Users() {
    }

    //@Override
    //public String getUsername() {
        //return username;
    //}

    //@Override
    //public boolean isAccountNonExpired() {
        //return true;
    //}

    //@Override
    //public boolean isAccountNonLocked() {
        //return true;
    //}

    //@Override
    //public boolean isCredentialsNonExpired() {
        //return true;
    //}

    //@Override
    //public boolean isEnabled() {
        //return true;
    //}

    //public void setUsername(String username) {
        //this.username = username;
    //}

    //@Override
    //public Collection<? > getAuthorities() {        //extends GrantedAuthority
        //return getRoles();
    //}

    //@Override
    //public String getPassword() {
        //return password;
    //}


}