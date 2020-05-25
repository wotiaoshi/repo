package com.unicom.datacollection.service.impl;

import com.unicom.datacollection.entity.User;
import com.unicom.datacollection.mapper.UserMapper;
import com.unicom.datacollection.service.UserService;
import com.unicom.datacollection.vo.UserRegisterParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
//
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUser(String userName, String password) {


        return userMapper.findUser(userName,password);
    }

    @Override
    public void updateUser(UserRegisterParam userRegisterParam) {
        User user = new User();
        BeanUtils.copyProperties(userRegisterParam,user);
        userMapper.updateUser(user);
    }

    @Override
    public void InsertUser(UserRegisterParam userRegisterParam) {

//        UserMapper userMapper;
        User user = new User();
        BeanUtils.copyProperties(userRegisterParam,user);
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }
}
