package com.unicom.datacollection.controller;

import com.unicom.datacollection.entity.User;
import com.unicom.datacollection.service.UserService;
import com.unicom.datacollection.to.CommonResult;
import com.unicom.datacollection.vo.UserRegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @author 王盘东
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
   private UserService userService;
    @PostMapping("/register")
    public Object register(@Valid UserRegisterParam userRegisterParam){
         userService.InsertUser(userRegisterParam);
        return "/login";
    }
    @PostMapping(value = {"/login"})
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        User user = userService.findUser(userName, password);
        String returnUserName = user.getUserName();
        if(!StringUtils.isEmpty(returnUserName)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",returnUserName);
            return "redirect:/main.html";
        }else{
            //登陆失败

            map.put("msg","用户名密码错误");
            return  "login";
        }

    }
    /**
     * 查询用户列表
     */
    @PostMapping("/list")
    public Object findUserList(){
        List<User> users = userService.findAll();
        return new CommonResult().success(users);
    }
    /**
     * 更新用户信息
     * 写的有很多瑕疵根据需求来
     */
    @PostMapping("/update")
    public Object updateUser(@RequestBody @Valid UserRegisterParam userRegisterParam){
        userService.updateUser(userRegisterParam);
        return new CommonResult().success("更新成功");
    }


    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public Object deleteUser(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
        return "删除成功";
    }

}
