package com.unicom.datacollection.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Data
public class User implements Serializable{
    /**
     * 用户id
     * 主键自动增长
     */
    private Integer id;
    private String password;
    private String userName;//唯一
    private String gender;
    private String teleNumber;
    private String email;
    /**
     * 用户头像
     */
    private String icon;

}
