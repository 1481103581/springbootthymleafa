package com.nala.service.impl;

import com.nala.application.SpringbootthymleafaApplication;
import com.nala.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = SpringbootthymleafaApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void getUserAll() {
        List<User> userAll = userService.getUserAll();
        System.out.println(userAll);
    }
}