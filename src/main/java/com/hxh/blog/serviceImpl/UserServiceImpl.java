package com.hxh.blog.serviceImpl;

import com.hxh.blog.mapper.UserMapper;
import com.hxh.blog.pojo.User;
import com.hxh.blog.service.UserService;
import com.hxh.blog.util.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 业务逻辑方法实现
 * serviceImpl
 * */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper = null;

    // 注册插入新用户
    @Override
    public ResponseWrapper insertUser(String username, String password) {
        User user = userMapper.queryUserByUsername(username);
        if (user == null) {
            User u = new User();
            u.setUsername(username);
//            password = setMd5(password);
            u.setPassword(password);
            userMapper.insertUser(u);
            return ResponseWrapper.markCustom(true, "200", "注册成功", null);
        }
        return ResponseWrapper.markCustom(false, "201", "电话重复", null);
    }

    // 登入判断账号密码
    @Override
    public ResponseWrapper login(String username, String password) {
        User user = userMapper.queryUserByUsername(username);
        try {
            if (user == null) {
                // 不存在账号
                return ResponseWrapper.markCustom(false, "202", "帐号不存在", null);
            } else {
                if (user.getPassword().equals(password)) {
                    // 存在账号 密码正确
                    return ResponseWrapper.markCustom(true, "200", "登入成功", null);
                } else {
                    // 存在账号 密码错误
                    return ResponseWrapper.markCustom(false, "201", "密码错误", null);
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return ResponseWrapper.markCustom(false, "202", "接口异常", null);
    }

    // 获取所有用户信息
    @Override
    public ResponseWrapper getAllUserData() {
        List<User> users = userMapper.getAllUserData();
        if (!users.isEmpty()) {
            return ResponseWrapper.markCustom(true, "200", "获取成功", users);
        } else {
            return ResponseWrapper.markCustom(false, "202", "无数据", null);
        }
    }
}
