package com.uniform.datacollection;

import com.uniform.datacollection.mapper.InterfaceMapper;
import com.uniform.datacollection.model.Interface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatacollectionSystemApplicationTests {

    @Autowired
    private InterfaceMapper interfaceMapper;

    @Test
    void contextLoads() {
        System.out.println(interfaceMapper.selectById(1));
    }

}
