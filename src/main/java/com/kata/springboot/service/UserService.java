package com.kata.springboot.service;

import com.kata.springboot.entity.User;
import java.util.List;


public interface UserService {
    User saveUser(User user);
    void deleteUserById(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}
