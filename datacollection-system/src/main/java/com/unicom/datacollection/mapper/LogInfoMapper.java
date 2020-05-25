package com.unicom.datacollection.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unicom.datacollection.model.LogInfo;

public interface LogInfoMapper extends BaseMapper<LogInfo> {
    int deleteByPrimaryKey(Integer id);

    int insert(LogInfo record);

    int insertSelective(LogInfo record);

    LogInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogInfo record);

    int updateByPrimaryKey(LogInfo record);
}