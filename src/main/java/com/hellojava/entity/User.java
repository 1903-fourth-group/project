package com.hellojava.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class User implements Serializable {
    private int userId;
    @NotNull(message = "用户名不能为空")
    @Length(min=3,max=6,message = "用户名长度必须在3--6之间")
    private String userName;
    @NotNull(message = "密码不能为空")
    @Length(min = 1,max = 10,message = "密码的长度必须在1--10位之间")
    private String userPwd;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
