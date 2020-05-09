package com.epam.spring.service;

import com.epam.spring.model.User;


public interface UserService {

    void save(User user);

    User findUserByLogin(String login);
}
