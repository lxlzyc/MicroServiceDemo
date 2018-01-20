package com.lxl.dao;

import com.lxl.model.Restaurant;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 22:29
 * @version: V 1.0
 */
public class InmemRestaurantRepository implements RestaurantRepository<Restaurant,String>{
    private Map<String,Restaurant> entities;

    public InmemRestaurantRepository() {
        this.entities = new HashMap<String,Restaurant>();
    }


    @Override
    public void add(Restaurant entity) {
        entities.put(entity.getName(),entity);
    }

    @Override
    public void remove(String id) {
        if(entities.containsKey(id)){
            entities.remove(id);
        }
    }

    @Override
    public void update(Restaurant entity) {
        if(entities.containsKey(entity.getName())){
            entities.put(entity.getName(),entity);
        }
    }
    public boolean CotainsName(String name) {
        return false;
    }

    @Override
    public boolean contains(String id) {
//        return false;
        throw new UnsupportedOperationException("NOT SUPPORTED YET");
    }

    @Override
    public Entity get(String id) {
//        return null;
        throw new UnsupportedOperationException("NOT SUPPORTED YET");
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }

    @Override
    public boolean cotainsName(String name) {
        return false;
    }
}
