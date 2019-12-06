package com.hxh.blog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
public class User {

    @ApiModelProperty(value = "ID" ,example = "11")
    private int id;
    @ApiModelProperty(value = "姓名" ,example = "小明")
    private String username;
    @ApiModelProperty(value = "密码" ,example = "123")
    private String password;
//    @ApiModelProperty(value = "昵称" ,example = "小白")
//    private String nickname;
//    @ApiModelProperty(value = "电话" ,example = "189")
//    private String phone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
