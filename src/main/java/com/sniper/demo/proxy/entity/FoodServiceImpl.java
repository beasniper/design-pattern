package com.sniper.demo.proxy.entity;

import com.sniper.demo.proxy.interface_.FoodService;

/**
 * @author sniper
 * @date 2021/7/31 10:14
 **/
public class FoodServiceImpl implements FoodService {
    @Override
    public void makeFood() {
        System.out.println("=== make food ===");
    }

    @Override
    public void makeDrink() {
        System.out.println("=== make drink ===");
    }
}
