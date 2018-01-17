package com.lxl.controller;

import com.lxl.model.Restaurant;
import com.lxl.service.RestaurantService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Description: 获取指定名称餐馆
 * @author: lxl
 * @date: 2018/1/17 22:26
 * @version: V 1.0
 */
@RestController
@RequestMapping("/v1/restaurants")
public class RestaurantController {
    protected Logger logger = Logger.getLogger(RestaurantController.class.getName());

    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Restaurant>> findByName(@RequestParam("name") String name){
        Collection<Restaurant>  restaurants = restaurantService.findByName(name);
        return restaurants == null || restaurants.size()<=0 ? new ResponseEntity<Collection<Restaurant>>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<Collection<Restaurant>>(restaurants,HttpStatus.OK);
    }
    @RequestMapping(value = "/{restaurant_id}",method = RequestMethod.GET)
    public ResponseEntity<Collection<Restaurant>> findById(@PathVariable("restaurant_id") String restaurant_id){
        Collection<Restaurant>  restaurants = restaurantService.findById(restaurant_id);
        return restaurants == null || restaurants.size()<=0 ? new ResponseEntity<Collection<Restaurant>>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<Collection<Restaurant>>(restaurants,HttpStatus.OK);
    }


}
