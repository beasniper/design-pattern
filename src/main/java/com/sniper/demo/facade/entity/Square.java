package com.sniper.demo.facade.entity;

/**
 * @author sniper
 * @date 2021/8/2 22:05
 **/
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("=== Square ===");
    }
}
