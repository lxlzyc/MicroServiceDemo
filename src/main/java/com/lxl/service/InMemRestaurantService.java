package com.lxl.service;

import com.lxl.dao.RestaurantRepository;
import com.lxl.model.Restaurant;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/17 22:47
 * @version: V 1.0
 */
public class InMemRestaurantService implements RestaurantRepository<Restaurant,String> {
    @Override
    public void add(Restaurant entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(Restaurant entity) {

    }

    @Override
    public boolean cotainsName(String name) {
        return false;
    }

    @Override
    public boolean contains(String id) {
        return false;
    }

    @Override
    public Entity get(String id) {
        return null;
    }

    @Override
    public Collection<Restaurant> getAll() {
        return null;
    }
}
