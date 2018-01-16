package com.lxl.model;

import java.math.BigInteger;

/**
 * @Description: 餐桌
 * @author: lxl
 * @date: 2018/1/16 22:14
 * @version: V 1.0
 */
public class Table extends BasicEntity<BigInteger>{
    private int capacity;

    public Table(String name, BigInteger id, int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
