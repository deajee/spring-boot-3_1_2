package com.kata.springboot.dao;



import com.kata.springboot.entity.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    User updateUser(User user);
    void deleteUserFromTable(Long id);
    List<User> getAllUsers();
    User findById(Long id);
}
