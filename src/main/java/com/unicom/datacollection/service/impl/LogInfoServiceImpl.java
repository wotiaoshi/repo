package com.unicom.datacollection.service.impl;

import com.unicom.datacollection.entity.LogInfo;
import com.unicom.datacollection.mapper.LogInfoMapper;
import com.unicom.datacollection.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Service
public class LogInfoServiceImpl implements LogInfoService {
    @Autowired
    private LogInfoMapper logInfoMapper;
    @Override
    public void insertLog(LogInfo logInfo) {
        logInfoMapper.insertLog(logInfo);
    }
}
