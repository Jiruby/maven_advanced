package com.wyq.ssm.controller;

import com.wyq.ssm.pojo.User;
import com.wyq.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find/{id}")
    public ModelAndView findById(@PathVariable("id") int id, ModelAndView modelAndView){
        User u = userService.findById(id);
        modelAndView.addObject("user",u);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
