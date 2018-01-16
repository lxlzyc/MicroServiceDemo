package com.lxl.controller;

import com.lxl.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 21:18
 * @version: V 1.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getString(){
        return "hello world";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUer(){
        return new User(1,"admin");
    }

}
