package com.epam.spring.dao;

import com.epam.spring.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDao extends JpaRepository<Message, Long> {
}
