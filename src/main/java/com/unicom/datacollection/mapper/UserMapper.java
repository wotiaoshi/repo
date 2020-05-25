package com.unicom.datacollection.mapper;

import com.sun.org.apache.xpath.internal.operations.String;
import com.unicom.datacollection.entity.User;
import org.apache.ibatis.annotations.*;
//import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
//@Repository
public interface UserMapper {
    /**
     * 根据用户账号查询用户信息
     */
    @Results(id = "resultMap",value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "password",column = "password"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "email",column = "email"),
            @Result(property = "teleNumber",column = "tele_number"),
            @Result(property = "icon",column = "icon"),
            @Result(property = "gender",column = "gender")
    })
    @Select("select*from tab_user")
    List<User> findAll();

    /**
     * 根据用户名密码验证登录
     * @param userName
     * @param password
     * @return
     */
    @Select("select * from tab_user where user_name = #{userName} and password = #{password}")
    @ResultMap("resultMap")
    User findUser(@Param("userName") java.lang.String userName, @Param("password") java.lang.String password);
    /**
     * 根据用户账号删除用户
     *二级缓存需开启，使用场景？@Param,@SelectKey,@Cachednamespace,@selectprovider
     */

    @Delete("delete from tab_user where id = #{id}")//#{fg}里面随便写相当于占位符
    void deleteUserById(Integer id);
    /**
     * 根据用户账号修改用户信息
     */
    @Update("update tab_user set password = '${password}' where id = ${id}")
    void updateUser(User user);
    /**
     * 添加一个用户
     */
    @Insert("insert into tab_user(password,user_name,icon,email,tele_number,gender) values('${password}','${userName}','${icon}','${email}','${teleNumber}','${gender}')")
    void insertUser(User user);


//    User findUser(java.lang.String userName, java.lang.String password);
}
