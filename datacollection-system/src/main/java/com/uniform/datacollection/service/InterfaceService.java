package com.uniform.datacollection.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uniform.datacollection.model.Interface;

import java.util.List;

/**
 * @author Zyx
 * @date 2020/5/24 12:42
 */
public interface InterfaceService{


    List<Interface> pageList();

    void addInterface(Interface inter);

    void deleteByIdList(List<Integer> ids);
}
