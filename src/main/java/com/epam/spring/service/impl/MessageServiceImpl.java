package com.epam.spring.service.impl;

import com.epam.spring.dao.MessageDao;
import com.epam.spring.model.Message;
import com.epam.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public void save(Message message) {
        messageDao.save(message);
    }

    @Override
    public List<Message> findAll() {
        return messageDao.findAll();
    }
}
