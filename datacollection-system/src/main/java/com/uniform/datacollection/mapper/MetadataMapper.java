package com.uniform.datacollection.mapper;

import com.uniform.datacollection.model.Metadata;

public interface MetadataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Metadata record);

    int insertSelective(Metadata record);

    Metadata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Metadata record);

    int updateByPrimaryKey(Metadata record);
}