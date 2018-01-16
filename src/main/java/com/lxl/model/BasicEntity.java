package com.lxl.model;

/**
 * @Description: 基类
 * @author: lxl
 * @date: 2018/1/16 22:11
 * @version: V 1.0
 */
public abstract class BasicEntity<T> extends Entity<T> {
    private T id;

    public BasicEntity(T id,String name) {
        super.id = id;
        super.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }


}
