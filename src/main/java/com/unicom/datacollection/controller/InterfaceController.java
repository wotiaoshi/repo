package com.unicom.datacollection.controller;

import com.unicom.datacollection.entity.Interface;
import com.unicom.datacollection.service.InterfaceService;
import com.unicom.datacollection.to.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Controller
@RequestMapping("/interface")
public class InterfaceController {
    @Autowired
    InterfaceService interfaceService;
    @GetMapping("/info")
    public Object findByFourFields(Interface inter, Map<String,Object> map){
        List<Interface> interInfos = interfaceService.findByFourFields(inter);
        map.put("interinfo",interInfos);
        return "intershow";
    }
}
