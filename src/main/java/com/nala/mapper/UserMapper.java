package com.nala.mapper;

import com.nala.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询所有
    List<User> getUserAll();
}
