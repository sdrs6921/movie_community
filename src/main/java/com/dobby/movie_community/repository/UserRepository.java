package com.dobby.movie_community.repository;

import com.dobby.movie_community.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(String id);
    List<User> findAll();
}
