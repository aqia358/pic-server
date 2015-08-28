package com.lhl.test.controller;

import java.util.Date;
import java.util.UUID;

import com.lhl.test.model.User;
import com.lhl.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by liuhl on 15-8-27.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/reg")
    public String register() {
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("test---------------");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String test2() {
        System.out.println("test---------------");
        return "index";
    }

    @RequestMapping("/user")
    public ModelAndView addUser(User user) {
        ModelAndView mav = null;
        user.setId(UUID.randomUUID().toString());
        user.setRegtime(new Date());
        try {
            userService.addUser(user);
            //	request.setAttribute("user", user);
            mav = new ModelAndView();
            mav.setViewName("success");
            mav.addObject("user", user);
            mav.addObject("msg", "注册成功了，可以去登陆了");
            return mav;
        } catch (Exception e) {
            mav.setViewName("error");
            mav.addObject("user", null);
            mav.addObject("msg", "注册失败");
            return mav;
        }
    }

}
