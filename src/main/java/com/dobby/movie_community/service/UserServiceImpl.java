package com.dobby.movie_community.service;


import java.util.List;

import com.dobby.movie_community.model.UserModel;
import com.dobby.movie_community.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int authenticateUser(UserModel user) {
        List<UserModel> userList = userRepository.findByUserIdAndUserPassword(user.getUserId(), user.getUserPassword()) ;
        return ( userList.size() == 1 ) ? 1 : 0;
    }
    

}
