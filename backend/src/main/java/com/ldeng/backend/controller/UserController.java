package com.ldeng.backend.controller;

import com.ldeng.backend.model.User;
import com.ldeng.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caglarturkurka on 7.10.2016.
 * s
 *asdad
 * asdasdad
 * asd
 * asdasd
 * ssss
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public User registerUser(@RequestBody User user){
        return userService.save(user);
    }
}
