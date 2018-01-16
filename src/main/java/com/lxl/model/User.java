package com.lxl.model;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 21:11
 * @version: V 1.0
 */
public class User {
    private long userId;
    private String userName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
