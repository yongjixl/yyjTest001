package com.yuan.test.service.impl;

import com.yuan.test.mapper.UserMapper;
import com.yuan.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.yuan.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper fdsfsda;

    @Override
    public User findUser(String name) {
        return fdsfsda.findByName(name);
    }
}
