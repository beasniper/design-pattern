package com.sniper.demo.facade.entity;

/**
 * @author sniper
 * @date 2021/8/2 22:04
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println(" === Circle === ");
    }
}
