package com.nala.service.impl;

import com.nala.mapper.UserMapper;
import com.nala.pojo.User;
import com.nala.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        List<User> userAll = userMapper.getUserAll();
        return userAll;
    }
}
