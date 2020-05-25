package com.unicom.datacollection.mapper;

import com.unicom.datacollection.entity.Interface;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface InterfaceMapper {//mybatis的驼峰和Unix（_）命名不是自动转换(-)松散绑定
    @Results(id = "interMap",value = {
        @Result(property = "id",column = "id",id = true),
        @Result(property = "name",column = "name"),
        @Result(property = "sourceSystem",column = "source_system"),
        @Result(property = "field",column = "field"),
        @Result(property = "dataContent",column = "data_content"),
        @Result(property = "dataType",column = "data_type"),
        @Result(property = "syncCycle",column = "sync_cycle"),
        @Result(property = "dataCount",column = "data_count"),
        @Result(property = "shuliangji",column = "shuliangji"),
        @Result(property = "collecyUnit",column = "collect_unit"),
        @Result(property = "interfaceComputer",column = "interface_computer"),
        @Result(property = "documentCatagory",column = "document_catagory"),
        @Result(property = "documentName",column = "document_name"),
        @Result(property = "duiSystem",column = "dui_system"),
        @Result(property = "duiSystemLeadingPerson",column = "dui_system_leading_person"),
        @Result(property = "benSystemLeadingPerson",column = "ben_system_leading_person"),
        @Result(property = "note",column = "note")
    })
    @Select("select*from tab_interface where name = '${name}' and field = '${field}' and sync_cycle = '{syncCycle}' and source = '${sourceSystem}'")
    List<Interface> findByFourFields(Interface inter);
}
