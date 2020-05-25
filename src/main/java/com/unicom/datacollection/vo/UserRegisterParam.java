package com.unicom.datacollection.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Data
public class UserRegisterParam implements Serializable{
    private Integer id;
//    ceshishishsisi
//    ghjkl
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 8,max = 18)//有没有保证唯一的校验注解会自定义注解
    private String userName;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 8,max = 18)
    private String password;
    private String icon;
    @Email
    private String email;
//    @Max(11)
//    @Min(11)
    private String teleNumber;
    private String gender;
}
