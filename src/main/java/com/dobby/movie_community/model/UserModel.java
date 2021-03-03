package com.dobby.movie_community.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "movie_user")
public class UserModel {

    @Id
    private String userId;

    private String userPassword;

    private String userGender;

    private String userName;

    private String userEmail;

    private String userAddress;

    private String userBirth;

    private String userPhone;

    
}
