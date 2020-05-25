package com.unicom.datacollection.service;

import com.unicom.datacollection.entity.LogInfo;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface LogInfoService {
    void insertLog(LogInfo logInfo);
}
