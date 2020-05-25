package com.uniform.datacollection.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uniform.datacollection.model.Interface;
import com.uniform.datacollection.model.Metadata;

public interface MetadataMapper extends BaseMapper<Metadata> {
    int deleteByPrimaryKey(Integer id);

    int insert(Metadata record);

    int insertSelective(Metadata record);

    Metadata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Metadata record);

    int updateByPrimaryKey(Metadata record);
}