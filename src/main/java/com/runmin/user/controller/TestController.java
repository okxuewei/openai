package com.runmin.user.controller;

import com.runmin.user.base.UserApi;
import com.runmin.user.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Buffett
 * @Date: 2019/3/17 19:27
 */
@RestController
@RequestMapping(UserApi.User.BASE)
public class TestController {
    @Autowired
    TestService testService;


    @PostMapping(UserApi.User.TEST)
    public String test(){
        //这是第一条注释；
        return "number:"+testService.queryCount();
    }
}
