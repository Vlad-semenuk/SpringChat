package com.epam.spring.service;

import com.epam.spring.model.Message;

import java.util.List;

public interface MessageService {

    void save(Message message);

    List<Message> findAll();
}
