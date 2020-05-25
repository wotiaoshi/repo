package com.unicom.datacollection.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zyx
 * @date 2020/5/12 17:38
 */
@Controller
public class MetadataController {


    @RequestMapping("/metadata")
    public String metadata() {
        return "metadata";
    }


}
