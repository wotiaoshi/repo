package com.unicom.datacollection.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

import java.util.Date;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
//@Slf4j
@Data
public class LogInfo {
//    WebMvcAutoConfiguration
    private Integer id;//主键自动增长
    private String operationMethodName;//增删改查的名字
    //private String operationType;//增删改查
    private String operationClassName;
    private String params;
    private Date visitDate;
    private Integer userId;
//    private Date responseDate;
//    private String message;
//    private String results;
}
