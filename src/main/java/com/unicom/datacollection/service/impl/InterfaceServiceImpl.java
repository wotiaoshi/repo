package com.unicom.datacollection.service.impl;

import com.unicom.datacollection.entity.Interface;
import com.unicom.datacollection.mapper.InterfaceMapper;
import com.unicom.datacollection.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Service
public class InterfaceServiceImpl implements InterfaceService {
    @Autowired
    private InterfaceMapper interfaceMapper;

    @Override
    public List<Interface> findByFourFields(Interface inter) {
        return interfaceMapper.findByFourFields(inter);
    }
}
