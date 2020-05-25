package com.unicom.datacollection.aop;

import com.unicom.datacollection.entity.LogInfo;
import com.unicom.datacollection.service.LogInfoService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Slf4j
@Aspect
@Component
public class LogAspect {
    @Autowired
    private LogInfoService logInfoService;
    @Around("execution(* com.unicom.datacollection.controller.InterfaceController.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;
        log.info("目标方法准备执行");
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        String className = joinPoint.getTarget().getClass().getName();//类名
        String paramsName = Arrays.toString(joinPoint.getArgs());
//        joinPoint.getSignature();
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        LogInfo logInfo = new LogInfo();
        logInfo.setUserId(2);
        logInfo.setVisitDate(new Timestamp(System.currentTimeMillis()));
        logInfo.setOperationMethodName(methodName);
        logInfo.setParams(paramsName);
        logInfo.setOperationClassName(className);
        logInfoService.insertLog(logInfo);
        return result;
    }
}
