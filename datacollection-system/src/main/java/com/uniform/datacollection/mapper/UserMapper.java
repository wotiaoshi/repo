package com.uniform.datacollection.mapper;

import com.uniform.datacollection.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}