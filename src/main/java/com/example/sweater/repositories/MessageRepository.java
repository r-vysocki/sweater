package com.example.sweater.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.sweater.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}