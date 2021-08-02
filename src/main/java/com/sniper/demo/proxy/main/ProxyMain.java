package com.sniper.demo.proxy.main;

import com.sniper.demo.proxy.entity.DynamicProxy;
import com.sniper.demo.proxy.entity.FoodServiceImpl;
import com.sniper.demo.proxy.entity.FoodServiceProxy;
import com.sniper.demo.proxy.interface_.FoodService;

/**
 * @author sniper
 * @date 2021/7/31 10:16
 **/
public class ProxyMain {
    public static void main(String[] args) {
        FoodService foodServiceImpl = new FoodServiceImpl();
        foodServiceImpl.makeFood();

        System.out.println("===========================================");
        FoodService foodService = new FoodServiceProxy();
        foodService.makeFood();

        System.out.println("===========================================");
        FoodService jdkProxy = (FoodService) DynamicProxy.getJDKProxyObject(new FoodServiceImpl());
        jdkProxy.makeFood();

        System.out.println("===========================================");
        FoodService cglibProxy = (FoodService) DynamicProxy.getCglibProxyObject(new FoodServiceImpl());
        cglibProxy.makeDrink();

    }
}
