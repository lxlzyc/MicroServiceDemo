package com.lxl.service;

import com.lxl.dao.RestaurantRepository;
import com.lxl.model.Restaurant;

/**
 * @Description: 基于领域模型设计 DDD
 * @author: lxl
 * @date: 2018/1/16 22:41
 * @version: V 1.0
 */
public class RestaurantService extends BaseService<Restaurant,String> {

    private RestaurantRepository<Restaurant,String> restaurantRepository;
    public RestaurantService(RestaurantRepository<Restaurant, String> repository) {
        super(repository);
        this.restaurantRepository = repository;
    }


    @Override
    public void add(Restaurant restaurant) throws Exception {
        if(restaurantRepository.cotainsName(restaurant.getName())){
            throw new Exception(String.format("There is already a product with the name -%s",restaurant.getName()));
        }

        if(restaurant.getName() == null || "".equals(restaurant.getName())){
            throw new Exception("Restaurant name cannot be null or empty String");
        }
        super.add(restaurant);
    }

}
