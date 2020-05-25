package com.unicom.datacollection;

import com.unicom.datacollection.mapper.InterfaceMapper;
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
