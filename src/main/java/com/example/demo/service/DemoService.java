package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoService {
    static Map<Integer, User> users = new HashMap<>();

    static {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("Test user " + i);
            users.put(i,user);
        }
    }

    public Map<Integer, User> getUsers() {
        return DemoService.users;
    }

    public User getUser(Integer id) {
        return DemoService.users.get(id);
    }
}
