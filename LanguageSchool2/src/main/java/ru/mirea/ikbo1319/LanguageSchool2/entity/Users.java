package ru.mirea.ikbo1319.LanguageSchool2.entity;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "t_user")
public class Users {                //implements UserDetails
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Transient
    private String passwordConfirm;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> roles;

    public Users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setUsername(String username) {
        this.username = username;
    }

    //@Override
    public Collection<? > getAuthorities() {        //extends GrantedAuthority
        return getRoles();
    }

    //@Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
}