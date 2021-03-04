package com.dobby.movie_community.repository;

import java.util.List;

import com.dobby.movie_community.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String>{
    public List<UserModel> findByUserIdAndUserPassword(String userId, String userPassword);
}
