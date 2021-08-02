package com.sniper.demo.proxy.entity;

import com.sniper.demo.proxy.interface_.FoodService;

/**
 * @author sniper
 * @date 2021/7/31 10:15
 **/
public class FoodServiceProxy implements FoodService {
    private FoodService foodService = new FoodServiceImpl();
    @Override
    public void makeFood() {
        System.out.println("=== @before === ");
        foodService.makeFood();
        System.out.println("=== @after === ");
    }

    @Override
    public void makeDrink() {
        System.out.println("=== @before === ");
        foodService.makeDrink();
        System.out.println("=== @after === ");
    }
}
