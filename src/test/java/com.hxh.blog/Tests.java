package com.hxh.blog;

import com.hxh.blog.service.UserService;
import com.hxh.blog.util.ResponseWrapper;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/*
* junit4进行业务和底层代码测试
* */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml", "classpath*:spring-mvc.xml"})
@WebAppConfiguration("src/main/resources/applicationContext.xml")
public class Tests {

    @Autowired
    private UserService userService = null;

    @Test
    public void test1() {
        ResponseWrapper responseWrapper = userService.getAllUserData();
        System.out.println(responseWrapper);
    }

}
