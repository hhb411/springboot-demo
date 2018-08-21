package com.example.domain;

/**
 * Created by hb on 2018/8/18.
 */

import java.io.Serializable;

public class UserDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String password;
    private String userSex;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "id:" + this.id + ", userName:" + this.userName + ", password:" + this.password + ", sex:" + userSex;
    }

}