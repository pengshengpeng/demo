package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    @Autowired
    private UserDao userDao;

    public String getString(String who) {
        return who + userDao.getString();
    }
}
