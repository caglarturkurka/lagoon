package com.ldeng.backend.service.impl;

import com.ldeng.backend.dao.UserDao;
import com.ldeng.backend.model.User;
import com.ldeng.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caglarturkurka on 7.10.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
