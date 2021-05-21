package ru.mirea.ikbo1319.LanguageSchool2.entity;

//import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
@Getter
@Setter
public class Roles {                //implements GrantedAuthority

    @Id
    private Long id;

    private String name;

    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<Users> users;

    public Roles() {
    }

    public Roles(Long id) {
        this.id = id;
    }

    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //@Override
    //public String getAuthority() {
        //return getName();
    //}
}