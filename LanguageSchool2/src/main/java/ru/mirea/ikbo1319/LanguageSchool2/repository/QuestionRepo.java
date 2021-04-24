package ru.mirea.ikbo1319.LanguageSchool2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.ikbo1319.LanguageSchool2.entity.Question;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {
}
