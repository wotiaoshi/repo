package com.unicom.datacollection.service;

import com.unicom.datacollection.entity.User;
import com.unicom.datacollection.vo.UserRegisterParam;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface UserService {
    List<User> findAll();
    User findUser(String userName,String password);
    void updateUser(UserRegisterParam userRegisterParam);
    void InsertUser(UserRegisterParam userRegisterParam);
    void deleteUserById(Integer id);
}
