package com.unicom.datacollection.entity;

import lombok.Data;

/**
 * 接口表
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Data
public class Interface {
    private Integer id;//接口序号主键自动增长
    private String name;//非空
    private String sourceSystem;//非空
    private String field;//非空归属IT域
    private String dataContent;
    private String dataType;
    private String syncCycle;//非空
    private Integer dataCount;
    private Double shuliangji;
    private String collectUnit;
    private String interfaceComputer;
    private String documentCatagory;
    private String documentName;
    private String duiSystemLeadingPerson;
    private String benSystemLeadingPerson;
    private String note;
    private String duiSystem;

}
