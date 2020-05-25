package com.unicom.datacollection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unicom.datacollection.mapper")
public class DatacollectionSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatacollectionSystemApplication.class, args);
    }

}
