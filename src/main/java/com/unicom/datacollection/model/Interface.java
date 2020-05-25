package com.unicom.datacollection.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tab_interface")
public class Interface {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String fromSource;

    private String field;//归属IT域

    private String dataContent;//数据内容

    private String dataType;//数据类型

    private String syncCycle;//同步周期

    private Long dataCount;//数据条目

    private Double shuliangji;//数量级

    private String collectUnit;//采集单位

    private String interfaceComputer;//接口机

    private String documentCatagory;//文件目录

    private String documentName;

    private String duiSystemLeadingPerson;

    private String benSystemLeadingPerson;

    private String description;


}