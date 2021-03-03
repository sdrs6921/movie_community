package com.dobby.movie_community.repository;

import com.dobby.movie_community.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryUserRepository implements UserRepository {
    private static Map<String, User> store = new HashMap<>();// KEY: 아이디

    @Override
    public User save(User user) {
        store.put(user.getUser_id(), user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        return store.values().stream()
                .filter(user -> user.getUser_id().equals(id)).findAny();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }


    public void clearStore(){
        store.clear();
    }
}
