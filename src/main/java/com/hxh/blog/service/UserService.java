package com.hxh.blog.service;

/*
 * 业务逻辑接口
 * service
 * */

import com.hxh.blog.util.ResponseWrapper;

public interface UserService {

    ResponseWrapper insertUser(String username, String password);

    ResponseWrapper login(String username, String password);

    ResponseWrapper getAllUserData();

}
