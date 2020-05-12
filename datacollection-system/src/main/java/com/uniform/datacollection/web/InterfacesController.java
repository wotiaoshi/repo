package com.uniform.datacollection.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zyx
 * @date 2020/5/12 17:32
 */
@Controller
public class InterfacesController {

    @RequestMapping("/interfaces")
    public String interfaces() {
        return "interfaces";
    }



}
