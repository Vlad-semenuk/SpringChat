package com.epam.spring.dao;

import com.epam.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
}
