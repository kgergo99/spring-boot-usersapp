package com.gergo.exercise.service;

import com.gergo.exercise.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static final List<User> users = new ArrayList<>();

    static {
        for (int i = 0; i<10; i++){
            users.add(new User(i+"th user", i+"th language", (100 + i) + "", i+"th bio", (i+0.3F) + "" ));
        }
    }

    public List<User> getAllUsers() { return users; }
}
