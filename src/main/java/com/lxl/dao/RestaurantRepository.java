package com.lxl.dao;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 22:27
 * @version: V 1.0
 */
public interface RestaurantRepository<Restaurant,String> extends Repository<Restaurant,String> {
    boolean cotainsName(String name);
}
