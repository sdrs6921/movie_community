package com.dobby.movie_community.repository;

import com.dobby.movie_community.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryUserRepositoryTest {

    MemoryUserRepository repository = new MemoryUserRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        User user = new User();
        user.setUser_id("yeji1220");
        user.setUser_password("1234");
        user.setUser_gender("f");
        user.setUser_name("anyeji");
        user.setUser_email("anyeji1220@haver.com");
        user.setUser_address("seoul,Korea");
        user.setUser_birth("1995-12-20");
        user.setUser_phone("010-0000-0000");

        repository.save(user);

        User result = repository.findById(user.getUser_id()).get();
        assertThat(user).isEqualTo(result);
    }
}
