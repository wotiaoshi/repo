package com.unicom.datacollection.service;

import com.unicom.datacollection.entity.Interface;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface InterfaceService {
    List<Interface> findByFourFields(Interface inter);
}
