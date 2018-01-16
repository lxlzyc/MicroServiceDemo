package com.lxl.model;

/**
 * @Description: 基类
 * @author: lxl
 * @date: 2018/1/16 22:11
 * @version: V 1.0
 */
public abstract class Entity<T> {
    T id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
