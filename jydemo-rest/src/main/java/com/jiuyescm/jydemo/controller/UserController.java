package com.jiuyescm.jydemo.controller;

import com.jiuyescm.jydemo.service.UserService;
import com.jiuyescm.jydemo.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void addUser(@RequestBody UserVo userVo){
        try{
            userService.addUser(userVo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
