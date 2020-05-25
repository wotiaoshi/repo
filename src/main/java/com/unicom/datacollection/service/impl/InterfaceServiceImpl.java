package com.unicom.datacollection.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.unicom.datacollection.mapper.InterfaceMapper;
import com.unicom.datacollection.model.Interface;
import com.unicom.datacollection.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zyx
 * @date 2020/5/24 21:40
 */
@Service
public class InterfaceServiceImpl implements InterfaceService {

    @Autowired
    private InterfaceMapper interfaceMapper;


    @Override
    public List<Interface> pageList() {
        return interfaceMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void addInterface(Interface inter) {
        interfaceMapper.insert(inter);
    }

    @Override
    public void deleteByIdList(List<Integer> ids) {
        interfaceMapper.deleteBatchIds(ids);
    }
}
