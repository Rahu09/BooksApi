package com.books.backendApi.repositories;

import com.books.backendApi.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {

    Iterable<AuthorEntity> ageLessThan(int age);

//    @Query("SELECT a from Author a where a.age > ?1")
//    Iterable<AuthorEntity> findAgeGreaterThan(int age);
}
