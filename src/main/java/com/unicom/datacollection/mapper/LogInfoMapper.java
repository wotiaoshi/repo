package com.unicom.datacollection.mapper;

import com.unicom.datacollection.entity.LogInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface LogInfoMapper {
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "visitDate",column = "visit_date"),
            @Result(property = "params",column = "params"),
            @Result(property = "operationMethodName",column = "operation_method_name"),
            @Result(property = "operationClassName",column = "operation_class_name"),
            @Result(property = "userId",column = "user_id")
    })
    @Insert("insert into tab_log_info(operation_method_name,operation_class_name,user_id,params,visit_date) values('${operationMethodName}','${operationClassName}',${userId},'${params}','${visitDate}')")
    void insertLog(LogInfo logInfo);
}
