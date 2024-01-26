package com.books.backendApi.services;

import com.books.backendApi.domain.entities.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();

    Optional<AuthorEntity> findOne(long id);

    boolean isExists(Long id);

    AuthorEntity partialUpdate(long id, AuthorEntity authorEntity);

    void delete(long id);
}
