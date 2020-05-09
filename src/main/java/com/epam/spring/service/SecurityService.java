package com.epam.spring.service;

public interface SecurityService {
    String findLoggedInUser();

    void autoLogin (String login, String password);
}
