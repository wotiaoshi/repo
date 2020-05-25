package com.unicom.datacollection.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unicom.datacollection.model.User;

public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(String accountId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}