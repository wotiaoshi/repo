package com.uniform.datacollection.web;

import com.uniform.datacollection.model.Interface;
import com.uniform.datacollection.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * @author Zyx
 * @date 2020/5/12 17:32
 */
@Controller
public class InterfacesController {

    @Autowired
    private InterfaceService interfaceService;

    @RequestMapping("/toInterfaces")
    public String  toInterfaces(Model model) {

        List<Interface> interfacesList = interfaceService.pageList();

        model.addAttribute("interfacesList", interfacesList);

        return "interfaces";
    }

    @RequestMapping("/interfaces/add")
    @ResponseBody
    public String add(Interface inter) {
        interfaceService.addInterface(inter);
        return "";
    }

    @RequestMapping("/interfaces/delete")
    @ResponseBody
    public String delete(Integer[] ids) {
        interfaceService.deleteByIdList(Arrays.asList(ids));
        return "";
    }

}
