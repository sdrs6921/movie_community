package com.dobby.movie_community.service;

import com.dobby.movie_community.model.User;
import com.dobby.movie_community.repository.MemoryUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService service;
    MemoryUserRepository repository;

    @BeforeEach
    public void beforeEach(){
//        repository = new MemoryUserRepository();
//        service = new UserService(repository);
    }

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    void 회원가입() {
        // given
        User user = new User();
        user.setUser_id("user1");

        // when
        String savedId = service.join(user);

        // then
        User findUser = service.findOne(savedId).get();
        assertThat(user.getUser_id()).isEqualTo(findUser.getUser_id());
    }

    @Test
    void 중복회원예외() {
        // given
        User user1 = new User();
        user1.setUser_id("user1");

        User user2 = new User();
        user2.setUser_id("user1");

        // when
        service.join(user1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> service.join(user2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}