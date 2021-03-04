package com.dobby.movie_community.service;

import com.dobby.movie_community.model.User;
import com.dobby.movie_community.repository.JpaUserTableRepository;
import com.dobby.movie_community.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(JpaUserTableRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
    * 회원가입
    */
    public String join(User user) {
        validateDuplicateUserid(user); // 아이디 중복 검사
        userRepository.save(user);
        return user.getUser_id();
    }

    private void validateDuplicateUserid(User user) {
        userRepository.findById(user.getUser_id())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    * 전체 회원 조회
    * */
    public List<User> findUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findOne(String userID) {
        return userRepository.findById(userID);
    }
}
