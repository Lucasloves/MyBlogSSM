package com.hxh.blog.controller;

import com.hxh.blog.service.UserService;
import com.hxh.blog.util.ResponseWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * 控制器 用来获取前端发来的信息
 * 匹配指定接口进行返回数据
 * */

@RestController
@RequestMapping("/user")
@Api(value = "/user", tags = "用户相关接口")
public class UserController {

    @Autowired
    private UserService userService = null;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ApiOperation("注册用户账号密码接口")
    public ResponseWrapper register(String username, String password) {
        return userService.insertUser(username, password);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ApiOperation("登录判断用户接口")
    public ResponseWrapper login(String username, String password) {
        return userService.login(username, password);
    }

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    @ApiOperation("获取全部用户接口")
    public ResponseWrapper getAllUser() {
        return userService.getAllUserData();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation("测试接口")
    public void test() {
        System.out.println("test");
    }

}
