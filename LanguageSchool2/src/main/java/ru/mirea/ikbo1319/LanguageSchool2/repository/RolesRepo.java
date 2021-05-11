package ru.mirea.ikbo1319.LanguageSchool2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Roles;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Long> {

}
